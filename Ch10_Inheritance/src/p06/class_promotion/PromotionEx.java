package p06.class_promotion;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

// promotion : 직계 부모가 가능한 것이 아니라, 모든 조상이 가능. (Object class까지 가능)
// primitive type : built-in type 이미 자바에서 다 설정해둠.
public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// promotion
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		Object o = a1;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e; // 아무 관계가 없다.
//		C c2 = d;

	}

}
