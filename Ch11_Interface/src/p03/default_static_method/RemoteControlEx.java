package p03.default_static_method;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();		// polymorphism  (자동형변환)
		rc.setMute(true);
		rc.setVolume(7);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
		rc = new Audio();	// promotion (부모에다가 자식을 넣음)
		rc.turnOn();		// polymorphism  (자동형변환)
		rc.setMute(true);
		rc.setVolume(7);
		rc.setMute(false);
		rc.turnOff();
		
	}

}
