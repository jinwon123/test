package p10.abstract_method;

// abstract method를 사용하려면 반드시 class는 abstract class이어야만 한다.
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 (abstract method) : method body에 대한 coding이 없음.
	public abstract void sound();
}
