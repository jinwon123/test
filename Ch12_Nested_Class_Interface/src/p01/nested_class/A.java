package p01.nested_class;

public class A {
	public A() {
		System.out.println("A 인스턴스 생성");
	}
	
	// instance member class 
	class B {
		int field1;
//		static int field2; // instance member class에서 static field 선언 불가.
		
		public B() {
		System.out.println("B instance member class 인스턴스 생성");
		}
		
		void method1 () {
			System.out.println("B class field1 : " + field1 );
		}
//		static void method2 () {}
	}
	
	// static member class
	static class C {
		int field1;
		static int field2 = 10;
		
		public C() {
		System.out.println("C static member class 인스턴스 생성");
		}
		
		void method1 () {
			System.out.println("C method1 class field1 : " + field1 );
		}
		static void method2 () {
			System.out.println("C method2 class field2 : " + field2 );
		}
	}
	
	// class A의 instance method
	void method () {
		int f1; // local variable
//		static int f2;
		// local class (method안에 선언된 class를 의미
		class D {
			int field1;
//			static int field2;
			
			public D() {
			System.out.println("D local class 인스턴스 생성");
			}
			void method1 () {
				System.out.println("local class field1 : " + field1 );
			}
//			static void method2 () {}
		}
		
		// method내에서 선언된 local class를 사용할 수 있는 곳은 method 내부에서만 가능
		// method 내부에서 new로 인스턴스 생성해서 사용해야만 함.
		D d = new D(); 
		d.field1 = 3;
		d.method1();
	}

}
