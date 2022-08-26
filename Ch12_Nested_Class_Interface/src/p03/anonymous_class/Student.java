package p03.anonymous_class;

public class Student extends Person {
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
	@Override
	void wake() {
		System.out.println("9시에 일어납니다.");
		study();
	}

}
