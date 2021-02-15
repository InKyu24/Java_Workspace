package chat.server;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Server {
	ArrayList<DataOutputStream> allClientOutput=new ArrayList<DataOutputStream>();
	
	public void broadcast (String msg) {
		synchronized (allClientOutput) {
			for (DataOutputStream out:allClientOutput) {
				try {
					out.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void chatProcess() {
		try {
			ServerSocket ss=new ServerSocket(9999); 					// 0~65565 1024번까지는 시스템 포트 21:FTP 23:Telnet 25:SMTP 80:HTTP
			System.out.println("server ready");
			while(true) {
				Socket s = ss.accept();
				System.out.println(s.getInetAddress()+"님 접속");
				DataInputStream in = new DataInputStream(s.getInputStream());
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				allClientOutput.add(out);
				ServerThread t = new ServerThread(in,out);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new Server().chatProcess();
	} // end main
	
	class ServerThread extends Thread {								// inner class 생성
		DataInputStream in;
		DataOutputStream out;
		public ServerThread(DataInputStream in, DataOutputStream out) {
			this.in=in;
			this.out=out;
		}
		@Override
		public void run() {
			String msg="";
			try {
				msg = in.readUTF();
				broadcast(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(msg);
		}
	}
}