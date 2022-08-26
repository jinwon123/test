package p02.anonymous_instance;

public interface RemoteControl {
	int MAX_VOLUME = 10; 		// 상수 
	public int MIN_VOLUME = 0;	// 상수
	
	public abstract void turnOff();
	void turnOn();
	public void setVolume(int volume);

}
