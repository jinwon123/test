package p05.protected_access_modifier.pkg2;

import p05.protected_access_modifier.pkg1.A;

// 1. 부모 constructor가 protected로 선언된 경우는 자식 class에서 new로 인스턴스 생성 불가. 
// - 대신에 super()를 통해 부모 생성자 호출 가능
// 2. protected로 선언된 field, method는 자식 class에서 사용 가능
public class D extends A {
	
	public D() {
		super(); // 부모인 A protected constructor 호출 
		this.field = "newValue";
		this.method();
	}
	
	public void method() {
//		A a = new A();
//		a.field = "newValue";
//		a.method();
	}


}
