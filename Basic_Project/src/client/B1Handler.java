/*package client;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class B1Handler extends WindowAdapter implements ActionListener {
	TextArea ta;
	TextField tf;
	
	public B1Handler(TextArea ta, TextField tf) {
		this.ta=ta;
		this.tf=tf;
	}

//	// 싱글톤
//	// 객체가 단 하나만 생기게 하는 class 작성 기법
//	// 생성자를 private하게 하고
//	// 자기 스스로 객체를 생성 (static)
//	// 자기가 생성한 객체를 리턴 (static)
//	private static B1Handler b1 = new B1Handler();
//	public static B1Handler getInstance() {
//		return b1;
//	}
//	private B1Handler() {
//		super();
//	}

	@Override
	public void actionPerformed(ActionEvent e) { // 하고 싶은 일
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
//	public void setResource(TextArea ta, TextField tf) {
//		this.ta=ta;
//		this.tf=tf;
//	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}	
}
*/