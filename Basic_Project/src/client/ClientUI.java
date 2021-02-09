package client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClientUI {
	TextArea ta;
	TextField tf;
	
	public void chatMsg() {
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
	public void onCreate() {
		Frame f = new Frame("나의 채팅"); // 제목있는 프레임 생성
		Button b1 = new Button("전송"); // 문구 들어간 버튼 생성
		Panel p=new Panel();	// 패널 생성
		tf = new TextField(20); // 길이 20 TextField 생성
		ta = new TextArea(); // TextArea 생성
		
	// 	EventSource에 EventListener를 달고 EventHandler 구현
	//	B1Handler bHand = B1Handler.getInstance();
	//	B1Handler bHand = new B1Handler();
	//	b1Hand.setResource(ta, tf);	// 클래스 내 메소드 호출
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
			}
		}); // 버튼에 ActionListener 추가
		
		
		tf.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
			}
		}); // TextField에 ActionListener 추가 
		
		
		// Local class : Inner class의 내용이 하나의 메소드에서만 사용할 때 클래스 선언과 객체화를 동시에 하는 것
		// WindowAdapter는 abstract 클래스로 생성자 호출이 불가하지만 FrameHandler 클래스를 익명의 클래스로 하여 호출을 한 것이라 볼 수 있다.
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		}); 
		
	//	FlowLayout mgr=new FlowLayout();
	//	GridLayout mgr=new GridLayout(2,3);
	//	f.setLayout(mgr);
		
		
		ta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ta.append("마우스 진입\n");
			}
		});
		
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
	
} // end of ClientUI class
