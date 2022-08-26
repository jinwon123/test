package p06.method_parameter_object_array;

public class Circle {
	private double radius;
	private String name;
	private static int numberOfObjects = 0; // new로 생성된 인스턴스 갯수를 관리
	
	public Circle() {
		this.radius = 1;
		this.numberOfObjects++;
	}

	public Circle(double newRadius) {
		this.radius = newRadius;
		this.numberOfObjects++;
	}
	
	// getter method
	public double getRadius() {
		return radius;
	}

	// setter method
	public void setRadius(double radius) {
		if (radius>=0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}

	// getter method
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// 원의 면적 구하는 메소드 선언
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// 원의 둘레 구하는 method 선언
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	private void printPrivateHello() {
		System.out.println("Hello, this is private method");
	}
}
