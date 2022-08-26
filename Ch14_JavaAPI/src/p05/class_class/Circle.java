package p05.class_class;

public class Circle {
	double radius = 1;
	String name = "플레인피자";
	int a = 10;
	
	public Circle() {
		
	}
	public Circle(double newRadius) {
		radius = newRadius;
	}
	public Circle(String newName) {
		name = newName;
	}
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
	}
	// 원의 면적 구하는 메소드 선언
	public double getArea() {
		return radius*radius*Math.PI;
	}
	// 원의 둘레 구하는 method 선언
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public void dummy() {
		
	}
}
