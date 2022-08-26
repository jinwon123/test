package p01.basic;

// class 이름 : Circle (첫글자 대문자) 
// 1. field (속성) : radius
// 2. constructor (생성자) : Circle(), Circle(double newRadius) 
// - 생성자의 이름과 class의 이름은 동일하다. 
// - 생성자는 특수한 경우에 사용하는 method (생성자는 new Circle()같은 방식으로 힙메모리에 인스턴스 만들 때 java 내부적으로 오직 한번만 실행이 된다.) 
// - 생성자 overloading : method overloading과 같은 개념이다.
// - class내의 생성자는 여러개 만들어 질 수 있다. 
// 3. class method : getArea(), getPerimeter(), setRadius(double newRadius)
public class Circle {
	double radius = 1;
	
	public Circle() {
		System.out.println("Circle default constructor 호출");
	}

	public Circle(double newRadius) {
		System.out.println("Circle(double newRadius) constructor 호출");
		radius = newRadius;
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
