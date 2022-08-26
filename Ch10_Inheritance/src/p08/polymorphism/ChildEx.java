package p08.polymorphism;

// 다형성 (polymorphism)
// 1. promotion(자동형변환) 발생
// - 부모인스턴스 = 자식인스턴스 (예 : Parent parent = child;)
// 2. 부모메소드를 자식메소드에서 override한 경우만 해당
// 3. 자동형변환과 override 모두 충족이 될때 부모메소드를 실행하는 것이아니라 override된 자식메소드를 실행.
public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		Parent parent = child; // class promotion(자동형변환)
		parent.method1();
		parent.method2();
//		parent.method3();
		
	}

}
