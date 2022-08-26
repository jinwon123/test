package p11.practice2;

public class PolymorphismEx {

	public static void main(String[] args) {
		displayObject(new Circle("red", false, 1));
		displayObject(new Rectangle("blue", true, 3, 4));
		
		DummyClass dummy = new DummyClass();
		System.out.println(dummy.toString()); // 자식것에 메소드가 없으면 부모것을 실행 object 클래스.

	}
	
	// parameter에서 promotion 발생
	public static void displayObject(GeometricObject geoObj) {
		System.out.println("Object 정보 : " + geoObj.toString()); // polymorphism 발생 (부모것을 부르지만 결국 override때문에 자식것이 실행)
	}
}
