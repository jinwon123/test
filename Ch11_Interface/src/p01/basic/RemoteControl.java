package p01.basic;

// access modifier가 기본적으로 public이 원칙이다.
public interface RemoteControl {
	// public static final int MAX_VOLUME = 10; Interface안에서는 내부적으로 상수로 정의해줌.
	int MAX_VOLUME = 10; 		// 상수 (상수는 기본적으로 초기값을 넣어줘야한다)
	public int MIN_VOLUME = 0;	// 상수
	
	public abstract void turnOff();
	// public abstract void turnOn();
	void turnOn();
	// public abstract void setVolume();
	public void setVolume(int volume);

}
