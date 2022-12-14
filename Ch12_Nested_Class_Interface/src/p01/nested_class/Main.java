package p01.nested_class;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// Instance member class 인스턴스 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// static member class 인스턴스 생성
		A.C c = new A.C(); // static이라 new 없이도 접근 가능.
		c.field1 = 3;
		c.method1();
		c.field2 = 5;
		c.method2();
		
		// local method 실행
		a.method();
	}

}
