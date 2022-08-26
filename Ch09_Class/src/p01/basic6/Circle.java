package p01.basic6;

public class Circle {
	double radius = 1;
	String name = "플레인피자";
	
	public Circle() {
		System.out.println("Circle() this : " + System.identityHashCode(this));
	}

	public Circle(double Radius) {
		System.out.println("Circle(double newRadius) this : " + System.identityHashCode(this));
		this.radius = Radius;
	}
	public Circle(String Name) {
		this.name = Name;
	}
	public Circle(double Radius, String Name) {
		System.out.println("Circle(double newRadius, String newName) this : " + System.identityHashCode(this));
		this.radius = Radius;
		this.name = Name;
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
