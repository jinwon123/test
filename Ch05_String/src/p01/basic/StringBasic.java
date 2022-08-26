package p01.basic;

// String (data) type
// 1. 메모리에서 사용하는 데이터 크기가 가변적인 것이 특징
// -> 실제 데이터를 heap메모리에 저장하고, String type 으로 선언된 변수에는 heap메모리의 주소값을 갖고 있다.
// 예를 들면, String message = "안녕하세요, 자바씨~~" 인 경우, 변수 message에는 heap메모리에 저장된 "안녕하세요, 자바씨~~" 데이터의 시작 주소값을 갖고 있다는 의미
// 2. 실제 사용 예 : 고객이름, 주소, 직업, 회사명, 상품명, ...
// 3. 산술연산 기호중에서 + 만 사용가능하다 -> 문자열 합치
// - 문자열 + 문자열(o), 숫자 + 문자열(o), 문자열 + 숫자(o)
public class StringBasic {

	public static void main(String[] args) {
		String message = "안녕하세요, 자바씨~~";
		String message1 = "정말 좋은 아침입니다.";
		String message2;
		
		System.out.println(message);
		System.out.println(message1);
		
		message2 = message + " " + message1;
		System.out.println(message2);
		
		// 2+3+message -> 5+"안녕하세요, 자바씨~~" -> "5"+"안녕하세요, 자바씨~~"
		message2 = 2+3+message;
		System.out.println(message2);
		
		message2 = message + 2 + 3;
		System.out.println(message2);
		
		int a = 10;
		System.out.println("a = " + a ); // String 덧셈 연산

	}

}
