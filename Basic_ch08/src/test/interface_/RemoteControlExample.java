package test.interface_;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;  // 인터페이스 변수 선언 
		rc = new TV();			// TV
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControl.changeBattery(); // Tv인지 audio인지 몰라		
		
	}
}
