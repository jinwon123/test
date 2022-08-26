package p01.basic2;

public class PhoneEx {

	public static void main(String[] args) {
		Phone phone;
		
//		phone = new ApplePhone();
//		phone = new LgPhone();
		phone = new SamsungPhone();
		
		phone.sendCall();
		phone.receiveCall();
//		phone.flash();			// 부모로 자동형변환 해서 사용 불가.

	}

}
