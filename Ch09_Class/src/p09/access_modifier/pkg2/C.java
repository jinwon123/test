package p09.access_modifier.pkg2;

import p09.access_modifier.pkg1.A;

// 1. 다른 package에서 default로 선언된 field, constructor, method 사용 불가.
public class C {
//	A a1 = new A(); // default constructor 호출.
	A a2 = new A(1); // public constructor 호출
//	A a3 = new A(1.0); // private constructor 호출 
	
	public C() {
//		a2.a = 1;  // default field 사용해서 안된다.
		a2.b = 2;  // public field 사용 
//		a2.c = 3;  // private field 사용해서 안된다.
		
		a2.printPublic();
//		a2.printDefault();
//		a2.printPrivate();
	}

}
