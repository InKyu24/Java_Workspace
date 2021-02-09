package client;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameHandler extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}	
}