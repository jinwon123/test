package p05.encapsulation;

// private
// - 대상 : field, method에 사용가능 (생성자에서도 사용 가능)
// - 사용 목적 : 
// 1.class를 사용하는 다른 class에서 사용하지 못하게 하는 것이 목적이다.
// -> 하지만, class내부에서는 제한없이 사용가능하다.
// 2. object oriented programming을 할 때, field는 private으로 선언하는것이 일반적이다.
// -> 대신에 private으로 선언한 field들에 대해서, 다른 class에서 해당 field를 사용하기 위해 public으로 선언한 getter/setter method를 제공한다.
// method에 대해서는 만약 private으로 선언한 것은 class 내부적으로만 사용하고 외부에 오픈 안하겠다는 의미.
// Encapsulation(캡슐화) : class에서 field, method등을 private으로 선언을 해서 외부에 공개하지 않는 것.
// -> information hiding (정보 은닉)
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
