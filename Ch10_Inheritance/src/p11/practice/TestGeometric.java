package p11.practice;

public class TestGeometric {

	public static void main(String[] args) {
		Circle circle = new Circle("red", true, 5);
		
		System.out.println("Circle 전체 정보 : " + circle.toString());
		System.out.println("Circle color : " + circle.getColor());
		System.out.println("Circle radius : " + circle.getRadius());
		System.out.println("Circle are : " + circle.getArea());
		System.out.println("Circle diameter : " + circle.getDiameter());
		
		System.out.println();
		
		Rectangle rectangle = new Rectangle("yellow", false, 4, 5);
		System.out.println("Ractangle 전체 정보 : " + rectangle.toString());
		System.out.println("Rectangle area : " + rectangle.getArea());
		System.out.println("Rectangle perimeter : " + rectangle.getPerimeter());

	}

}
