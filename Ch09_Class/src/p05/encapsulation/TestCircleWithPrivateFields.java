package p05.encapsulation;

public class TestCircleWithPrivateFields {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		
		// Circle class에서 private으로 선언된 field, method는 사용 불가.
//		circle.radius = 10;
//		circle.printPrivateHello();
		System.out.println("circle radius : " + circle.getRadius() + ", area : " + 
				circle.getArea() + ", 생성 인스턴스 갯수 : " + circle.getNumberOfObjects());

		circle.setRadius(10);
		System.out.println("circle radius : " + circle.getRadius() + ", area : " + 
				circle.getArea() + ", 생성 인스턴스 갯수 : " + circle.getNumberOfObjects());
	}

}
