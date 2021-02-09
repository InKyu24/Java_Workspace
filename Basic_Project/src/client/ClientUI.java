package client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientUI {
	TextArea ta;
	TextField tf;
	
	public void onCreate() {
		Frame f = new Frame("나의 채팅"); // 제목있는 프레임 생성
		Button b1 = new Button("전송"); // 문구 들어간 버튼 생성
		Panel p=new Panel();	// 패널 생성
		tf = new TextField(20); // 길이 20 TextField 생성
		ta = new TextArea(); // TextArea 생성
		
	// 	EventSource에 EventListener를 달고 EventHandler 구현
	//	B1Handler b1Hand = B1Handler.getInstance();
		B1Handler hand = new B1Handler();
	//	b1Hand.setResource(ta, tf);	// 클래스 내 메소드 호출
		b1.addActionListener(hand); // 버튼에 ActionListener 추가
		tf.addActionListener(hand); // TextField에 ActionListener 추가 
		f.addWindowListener(hand);
		
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
	
	public static void main(String[] args) {
		ClientUI ui=new ClientUI();
		ui.onCreate();
	} // end of main
	
	public class B1Handler extends WindowAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { // 하고 싶은 일
			String msg=tf.getText();
			ta.append(msg+"\n");
			tf.setText("");
		}

		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}	
	} // end of B1Handler class

} // end of ClientUI class
