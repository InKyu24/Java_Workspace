package client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class ClientUI {
	public static void main(String[] args) {
		Frame f = new Frame("나의 채팅");
		Button b1 = new Button("전송");
		Panel p=new Panel();
		TextField tf = new TextField(20);
		TextArea ta = new TextArea();
		
	// 	EventSource에 EventListener를 달고 EventHandler 구현
		B1Handler b1Handler = new B1Handler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		tf.addActionListener(b1Handler);
		WindowListener e = new FrameHandler();
		f.addWindowListener(e);
		
	//	FlowLayout mgr=new FlowLayout();
	//	GridLayout mgr=new GridLayout(2,3);
	//	f.setLayout(mgr);
		
		p.setBackground(Color.black);
		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		

		
		
	
	/* 	Color bgColor = new Color (123,45,6);
		f.setBackground(bgColor); */
		f.setBackground(Color.darkGray);				
		f.setLocation(750, 300);
		f.setSize(400, 500);
		f.setVisible(true);
		
	}

}
