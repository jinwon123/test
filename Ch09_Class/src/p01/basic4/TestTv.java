package p01.basic4;

// 1. Tv class를 사용 -> TestTv는 고객 
// 2. Tv class를 사용하는 고객은 거의 대부분 method 사용 (field값을 직접 사용 안함)
public class TestTv {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		// tv를 turnOn 하지 않은 상태에서는 channel, volume 변경 불가능. 
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		tv1.printTvInformation();
		
		tv1.turnOn();
//		tv1.channel = 150; 고객이 field값을 마음대로 수정하면 class내에서 method등을 사용할 때 원치낳는 오작동 발생 가능. 
		tv1.setChannel(20);
		tv1.setVolume(5);
		
		tv1.printTvInformation();
		
		Tv tv2 = new Tv();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		tv2.printTvInformation();
		
		tv1.turnOff();
		tv2.turnOff();

	}

}
