package p07.default_method_inheritance2;

// 부모 Interface에서 선언된 default method를 자식 Interface에서 사용하는 방법
// 1. 부모 Interface에서 선언된 default method를 단순 사용
// 1. 부모 Interface에서 선언된 default method를 자식 Interface에서 override하여 사용
// 1. 부모 Interface에서 선언된 default method를 자식 Interface에서 abstract method로 override하여 사용
public class ChildInterfaceEx {

	public static void main(String[] args) {
		ChildInterface ci = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("익명 method1 실행");
			}
			
			@Override
			public void method3() {
				System.out.println("익명 method3 실행");

			}
			
			@Override
			public void method2() {
				System.out.println("익명 method2 실행");
			}
		};
		
		ci.method1();
		ci.method2();
		ci.method3();
		
	}

}
