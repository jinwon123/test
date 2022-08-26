package p04.static_main_method;

// 1. instance method를 선언하고 사용하는 목적
// - heap memory에 생성된 instance field들을 사용하겠다는 의미.
// - instance method안에서 static field, static method 사용가능.
// 2. static method를 선언하고 사용하는 목적 (예외적인 경우에만 사용한다)
// - heap memory에 생성된 instance field들을 사용하지 않겠다는 의미.
// - 공통으로 변함없이 사용되는 메소드(예를 들면 Math안에 들어있는 메소드들)
// -> 많이 사용되지 않는 메소드 
// - static field는 같이 사용 가능
// - 굳이 instance field나 instance method를 사용하고 싶은 경우에는 static method안에서 new로 인스턴스 생성 후에 인스턴스를 사용.
public class Car {
	int speed;
	String name;
	static String color;
	
	public Car() {
		
	}
	
	// this는 인스턴스를 의미한다.
	public Car(String color) {
		Car.color = color;
	}
	// static method = 인스턴스를 쓰지 않겠다는 의미.
	public static void printStaticHello() {
//		speed = 10;
		System.out.println("Hello, static method");
	}
	// instance method
	// instance method 안에서는 instance field, 다른 instance method 사용 가능하다.
	public void printInstanceHello() {
		speed = 5;
		System.out.println("Hello, instance method");
		dummy(); // static에서 instance를 들어오는건 가능.
	}
	
	public static void dummy() {
		System.out.println("this is dummy static method");
	}

	public static void main(String[] args) {
		// static method에서 static field나 다른 static method 사용 가능
//		Car.color = "red";
//		Car.printStaticHello();
		color = "red";
		printStaticHello();
//		speed = 10; method인 경우 instance 사용 불가.
		// static method에서 instance field나 다른 instance method 사용 불가능
//		printInstanceHello();
		
		// instance field나 instance method는 반드시 new로 인스턴스 생성후에 사용해야만 한다.
		Car car = new Car();
		car.speed = 10;
		car.printInstanceHello();
		
//		Math.cos(50);
	}

}
