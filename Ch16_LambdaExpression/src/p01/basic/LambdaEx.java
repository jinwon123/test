package p01.basic;

// Lambda Expression 정의
// 1. Interface의 추상메소드로만 사용 가능
// 2. Interface의 추상메소드가 1개만 있을 경우에만 사용 가능
// 3. Lambda expression(람다 표현식)으로 생성된 인스턴스는 내부적으로 Interface를 자식 익명객체로 만든것과 동일하다.
// 4. Lambda expression 예
// () -> {System.out.println("Hello, Lambda function MyInterface Instance");};
// - sayHello() 추상 메소드를 구현한 것을 표현
// () : method parameter list 
// {System.out.println("Hello, Lambda function MyInterface Instance");}; : sayHello method의 body를 coding한 것
public class LambdaEx {

	public static void main(String[] args) {
		MyInterfaceImpl mi = new MyInterfaceImpl();
		mi.sayHello();
		
		// 인터페이스를 익명객체로 생성하여 사용
		MyInterface ma = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello, Anonymous MyInterface Instance");
				
			}
		};
		ma.sayHello();

		// Lambda 표기법
		MyInterface ml = () -> {System.out.println("Hello, Lambda function MyInterface Instance");};
		ml.sayHello();
	}

}
