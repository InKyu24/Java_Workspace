package test.datatype;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MyUI {

	public static void main(String[] args) {
		Button b=new Button("전송");		//SEND라고 써있는 b버튼 생성.
		Frame f=new Frame();			//f프레임 생성.
		f.add(b,BorderLayout.SOUTH);	//f프레임에 b버튼을 하단에 추가
		f.setSize(500, 400);			//f프레임 사이즈 500*400
		f.setVisible(true);				//f프레임이 보여지게 세팅.
	}

}
