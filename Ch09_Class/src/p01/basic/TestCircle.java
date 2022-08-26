package p01.basic;

// 1. Circle c 의미 
// - Circle : class 이름이면서 data 타입
// - Circle class 내부에는 field인 radius가 있고 method인 getArea, getPerimeter, setRadius 존재. 
// - c, c2 : Circle 인스턴스(객체) 를 가리키는 변수 
// 2. new Circle() 명령어의 기계어들로 변환시 실행 순서 
// - new를 실행 : heap memory에 Circle class의 인스턴스를 만들고, 인스턴스의 힙메모리 주소를 가지고 있다. 
//   instance 안에는 field들만 가지고있음. (radius field 만 가지고 있다.) method는 힙메모리에 없다. 
// - Circle class의 생성자(constructor) method인 public Circle() 을 실행한다.
//   heap 메모리의 주소를 class내에 this라는 변수 이름으로 전달 (this : Java내부에서 관리되는 이름) 
// - heap 메모리에서 생성된 인스턴스 주소를 stack 메모리에 있는 변수 c에 넣어준다.
// 3. Circle class의 인스턴스인 c, c2를 사용하여 Circle class의 field와 method를 사용한다.
public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println("Circle class 객체(인스턴스)인 c의 반지름 : " + c.radius);
		System.out.println("Circle class 객체인 c의 면적 : " + c.getArea());
		System.out.println("Circle class 객체인 c의 둘레 : " + c.getPerimeter());
		
		System.out.println();
		
		c.setRadius(3);
		System.out.println("Circle class 객체(인스턴스)인 c의 반지름 : " + c.radius);
		System.out.println("Circle class 객체인 c의 면적 : " + c.getArea());
		System.out.println("Circle class 객체인 c의 둘레 : " + c.getPerimeter());

		System.out.println();
		
		Circle c2 = new Circle(2);
		
		System.out.println("Circle class 객체(인스턴스)인 c2의 반지름 : " + c2.radius);
		System.out.println("Circle class 객체인 c2의 면적 : " + c2.getArea());
		System.out.println("Circle class 객체인 c2의 둘레 : " + c2.getPerimeter());
	}

}
