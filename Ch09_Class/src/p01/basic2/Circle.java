package p01.basic2;

// 1. Java class는 main method가 있는 class와 main method가 없는 class들로 구분 가능하다. 
// 2. Java Programming 한다는 말의 의미 
// - 1개의 main 메소드가 있는 class + main 메소드가 없는 여러개의 class들을 구현한다는 것. 
// - main method가 있는 class는 main method가 없는 class들을 사용한다. 
// - main method가 없는 class들도 main method가 없는 다른 class들을 사용가능하다. 
// 3. main method가 없는 class들을 일반적으로 Java Library라고 부른다.
// - Java에서 기본적으로 제공하는 Library : Scanner, System, ...
// - JSP, Spring에서 제공하는 web programming class Library
// - Java 개발자가 만든 class Library
// 4. Class 하나가 OOP(object oriented Programming)의 1개의 객체를 의미한다.
public class Circle {
	double radius = 1;
	String name = "플레인피자";
	
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
}
