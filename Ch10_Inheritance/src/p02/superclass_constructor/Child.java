package p02.superclass_constructor;

// 1. super와 this
// - super : heap 메모리에 있는 Parent class의 instance
// - this : heap 메모리에 있는 자기 자신의 instance
// 2. super(homePhoneNumber);
// - 부모 생성자 호출 (본인의 다른 생성자 this(...);)
public class Child extends Parent {
	
	public Child() {
		System.out.println("Child - default constructor 호출");
	}
	
	public Child(int homePhoneNumber) {
//		this.homePhoneNumber = homePhoneNumber;
		super(homePhoneNumber);
		System.out.println("Child - Child(int homePhoneNumber) constructor 호출");
	}
	
	public void printParentInformation() {
		super.name = "홍아버지";
		super.age = 55;
		
		System.out.println("Parent 이름 : " + super.name + ", Parent 나이 : "  + super.age);
		super.dummyParent();
	}

}
