package p09.access_modifier.pkg1;

public class B {
	A a1 = new A(); // default constructor 호출
	A a2 = new A(1); // public constructor 호출
//	A a3 = new A(1.0); // private constructor 호출안됨 

	public B() {
		a1.a = 1; // default field 사용가능 
		a1.b = 2; // public field 사용가능 
//		a1.c = 3; // private field 사용 불가.
		
		a1.printDefault(); // default method
		a1.printPublic();
//		a1.printPrivate();
	}
}
