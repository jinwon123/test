package p03.while_basic;


// 1. while, do~ while, for : 특정 명령어 집합을 반복적으로 수행하고자 할 때 사용하는 command
//  예 ) 수능 50만명 성적처리
// 2. while (boolean : 조건식) { A } -> boolean 이 true 인 동안에 A 명령어를 반복 수행한다.
//  - 초기값과 while문 조건 증감 명령어를 꼼꼼히 살펴볼 필요가 있다.
public class WhileBasic {

	public static void main(String[] args) {
		
		// 반복문 초기화
		int count = 0;
		while(count < 10) { // (조건식) 의 값이 참일 경우. 거짓이 될 경우 바깥으로 빠져나간다.
			System.out.println("Java씨, 존경합니다. ");
			count++; // while 문의 조건식 결과를 false 로 만들어 줄 수 있는 조건 증감 명령어
		}
		System.out.println();
		
		count = 1;
		while(count <= 10) {
			System.out.println("Java씨, 존경합니다. ");
			count++;
		}
		System.out.println();
		
		count = 10;
		while(count >= 1) {
			System.out.println("Java씨, 존경합니다. ");
			count--;
		}
		System.out.println();
		
		count = 1;
		int endValue = 10;
		while(count <= endValue) {
			System.out.println("Java씨, 존경합니다. ");
			count++;
		}

	}

}
