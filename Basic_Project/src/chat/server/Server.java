package chat.server;

import java.io.*;
import java.net.*;

public class Server {
	public void chatProcess() {
		try {
			ServerSocket ss=new ServerSocket(9999); //0~65565 1024번까지는 시스템 포트 21:FTP 23:Telnet 25:SMTP 80:HTTP
			System.out.println("server ready");
			while(true) {
				Socket s = ss.accept();
				System.out.println(s.getInetAddress()+"님 접속");
				DataInputStream in = new DataInputStream(s.getInputStream());
				ServerThread t = new ServerThread(in);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new Server().chatProcess();
	} // end main
	
	class ServerThread extends Thread {			// inner class 생성
		DataInputStream in;
		public ServerThread(DataInputStream in) {
			this.in=in;
		}
		@Override
		public void run() {
			String msg="";
			try {
			msg = in.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(msg);
		}
	}
}