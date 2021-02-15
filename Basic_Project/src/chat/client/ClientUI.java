package chat.client;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ClientUI {
	TextArea ta;
	TextField tf;
	DataOutputStream out;
	DataInputStream in;
	String chatId;
	
	class ClientThread extends Thread{				// inner class 생성
		@Override
		public void run() {
			while(true) {
				try {
					ta.append(in.readUTF()+"\n");	// 채팅 메세지 읽기 (반복)
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void chatMsg() { 				
		String msg=tf.getText();
		try {
			out.writeUTF(chatId + msg);				// 채팅 메세지 보내기
		} catch (IOException e) {
			e.printStackTrace();
		}
		tf.setText("");
	}
	
	public void onCreate() { 						// Local class
		Frame f = new Frame("나의 채팅"); 				// 제목있는 프레임 생성
		Button b1 = new Button("join"); 			// 문구 들어간 버튼 생성
		Button b2 = new Button("send");
		Panel p=new Panel();						// 패널 생성
		tf = new TextField(20); 					// 길이 20 TextField 생성
		ta = new TextArea(); 						// TextArea 생성

		MenuBar mb = new MenuBar();					// Menubar 생성
		Menu file_menu = new Menu("File");			// 파일 Menu 생성
		Menu edit_menu = new Menu("Edit");			// 편집 Menu 생성
		MenuItem open_item = new MenuItem("Open");	 // 열기  MenuItem 생성
		MenuItem save_item = new MenuItem("Save");	 // 저장 MenuItem 생성
		MenuItem close_item = new MenuItem("Close"); // 닫기 MenuItem 생성
		
		file_menu.add(open_item);					// 파일 Menu에 열기 MenuItem 추가 
		file_menu.add(save_item);					// 파일 Menu에 저장 MenuItem 추가
		file_menu.add(close_item);					// 파일 Menu에 닫기 MenuItem 추가
		mb.add(file_menu);							// Menubar에 파일 Menu 추가
		mb.add(edit_menu);							// Menubar에 편집 Menu 추가
		f.setMenuBar(mb);							// 프레임에 Menubar 생성

		save_item.addActionListener(new ActionListener() {		// 저장 MenuItem 행동 메소드 설정
			@Override
			public void actionPerformed(ActionEvent a) {
				FileDialog save=new FileDialog(f, "저장 창", FileDialog.SAVE);
				save.setVisible(true);
				
				FileWriter fw=null;
				try {
					fw=new FileWriter(save.getDirectory()+save.getFile());
					fw.write(ta.getText());	
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					 try {
						 if(fw !=null ) fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}		
				
			}
		});
		
		open_item.addActionListener(new ActionListener() {		// 열기 MenuItem 행동 메소드 설정		
			@Override
			public void actionPerformed(ActionEvent a) {
				System.out.println("file open?");
				FileDialog openDialog=new FileDialog(f, "열기 창", FileDialog.LOAD);
				openDialog.setVisible(true);

				FileReader fr = null;
				BufferedReader br=null;
				try {
					fr = new FileReader(openDialog.getDirectory() + openDialog.getFile());
					br = new BufferedReader(fr);
					String oneLine = "";
					ta.setText("");
					while((oneLine=br.readLine()) != null) {
						ta.append(oneLine+"\n");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(br != null) br.close();
						if(fr != null) fr.close();
					} catch(IOException e) {	
					}
				}
			}
		});

		close_item.addActionListener(new ActionListener() {		// 닫기 MenuItem 행동 메소드 설정
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});

		f.addWindowListener(new WindowAdapter(){				// 종료 버튼 행동 메소드 설정
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		}); 
		
	/* 	EventSource에 EventListener를 달고 EventHandler 구현
	 	EventSource에 EventListener를 달고 EventHandler 구현
		B1Handler bHand = B1Handler.getInstance();
		B1Handler bHand = new B1Handler();
		b1Hand.setResource(ta, tf);	// 클래스 내 메소드 호출
		[딱 하나의 메소드만 가진 인터페이스를 @functionalInterface라고 한다]
		@functionalInterface는 람다식으로 표현 가능하다.	
		b1.addActionListener((ActionEvent e) -> { // 람다식
					chatMsg();
				}
			); 
		b1.addActionListener((ActionEvent e) -> chatMsg()); // 람다식2
		b1.addActionListener((e) -> chatMsg()); // 람다식3	
		b1.addActionListener((ActionEvent e) -> chatMsg()); // 람다식2
		b1.addActionListener((e) -> chatMsg()); // 람다식3	
		b1.addActionListener(c -> chatMsg()); // 람다식4		*/
	
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			// 채팅 서버 연결
				chatId="["+tf.getText()+"]";
				ta.setText(chatId+"님 채팅을 시작합니다\n");
				try {
					Socket s = new Socket("localhost", 9999);
					out=new DataOutputStream(s.getOutputStream());
					in=new DataInputStream(s.getInputStream());
					ClientThread t = new ClientThread();
					t.start();
					ta.append("연결 OK\n");
					tf.setText("");
					
				} catch (UnknownHostException e1) {				
					e1.printStackTrace();
				} catch (IOException e1) {				
					e1.printStackTrace();
				}
			}
		});
		
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();				
			}
		});
		
		// Anonymous Local class : Inner class의 내용이 하나의 메소드에서만 사용할 때 클래스 선언과 객체화를 동시에 하는 것
		// WindowAdapter는 abstract 클래스로 생성자 호출이 불가하지만 FrameHandler 클래스를 익명의 클래스로 하여 호출을 한 것이라 볼 수 있다.
		//	FlowLayout mgr=new FlowLayout();
		//	GridLayout mgr=new GridLayout(2,3);
		//	f.setLayout(mgr);
		
		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
		}
			
			
		public static void main(String[] args) {
			ClientUI ui=new ClientUI();
			ui.onCreate();
		}														//end main

}																//end ClientUi