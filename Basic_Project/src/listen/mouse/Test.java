package listen.mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test {
	public static void main(String[] args) {
		Frame f = new Frame();
		TextArea ta = new TextArea();
		
		A handler = new A();
		ta.addMouseListener(handler);
		
		ta.setBackground(Color.BLACK);
		f.add(ta,BorderLayout.CENTER);
		Panel p = new Panel();
		p.setSize(500, 100);
		p.setBackground(Color.DARK_GRAY);
		f.add(p, BorderLayout.SOUTH);
		f.setSize(500, 300);
		f.setVisible(true);
		
		
	}
}


class A implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스가 클릭됨");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스가 눌렸음");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스가 릴리즈됨");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 TextArea 안으로 들어옴");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 TextArea 밖으로 나감");
		
	}
	
}