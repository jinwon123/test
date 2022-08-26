package p01.basic7_this;

public class Circle {
	double radius;
	String name;
	
	public Circle() {
//		this.radius = 1;
//		this.name = "플레인피자";
		this(1, "플레인피자"); // this 는 constructor를 의미
		System.out.println("end of Default Constructor call");
	}

	public Circle(double radius) {
//		this.radius = radius;
//		this.name = "플레인피자";
		this(radius, "플레인피자");
		System.out.println("Circle(double radius) is called");
	}
	public Circle(String name) {
//		this.radius = 1;
//		this.name = name;
		this(1, name);
		System.out.println("Circle(String name) is called");
	}
	public Circle(double radius, String name) {
		System.out.println("Circle(double radius, String name) is called");
		// formal parameter의 입력값이 valid(유효한값)인지 체크하는 로직이 코딩되어야함. 
		if (radius>0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
		this.name = name;	
	}
	
	// 원의 면적 구하는 메소드 선언
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	// 원의 둘레 구하는 method 선언
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	public void setRadius(double Radius) {
		// plainPizza.radius = newRadius랑 같은 말. 
		this.radius = Radius;
	}
	public void printCircleInformation() {
		System.out.println("name : " + this.name + ", radius : " + this.radius);
	}
}
