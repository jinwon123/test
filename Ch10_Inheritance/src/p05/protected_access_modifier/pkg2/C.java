package p05.protected_access_modifier.pkg2;

// A class와 상속 관계가 아닌 다른 package의 C class 에서는 A class에서 protected로 선언된 field, constructor, method 사용 불가능.
import p05.protected_access_modifier.pkg1.A;

public class C {
	
	public void method() {
//		A a = new A();
//		a.field = "newValue";
//		a.method();
	}


}
