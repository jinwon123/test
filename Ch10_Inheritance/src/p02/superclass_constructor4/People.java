package p02.superclass_constructor4;

// 모든 class의 부모 class는 Object class이다.
// - 모든 class를 new로 인스턴스 만들 때 heap memory에 인스턴스가 생성되기전에 Object class의 인스턴스가 먼저 생성된다.
// - 부모가 Object class인 경우는 생략 가능 (Java가 자동으로 힙메모리에 인스턴스를 생성해준다)
public class People extends Object {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
//		this(); // 본인 class의 다른 생성자 호출 가능
		super(); // Object class의 default constructor 호출 
		this.name = name;
		this.ssn = ssn;
	}

	public People() {
		System.out.println("Parent - default constructor");
	}

}
