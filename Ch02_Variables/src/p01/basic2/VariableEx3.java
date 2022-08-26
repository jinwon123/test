package p01.basic2;

// literal(리터럴) : 변수 선언할 때 초기화 값 또는 변수 사용할 때 새로 할당된 값들을 의미한다. 데이터 타입에 종속되어있다. 
// - literal의 예 : 15, 5, 5.0, 0.1, 30
// 15, 5, 30 -> 정수 리터럴
// 5.0, 0.1 -> 실수 리터럴
// - literal 값들은 프로그램이 메모리에서 실행할 때 같이 별도로 테이블 등으로 관리되고 있다.

/*****************************************/
/* Class 이름 : VariableEx3               */
/* Class 용도 : 청소년과 성인을 구분하는 class  */
/* 최초 생성일자 : 2022.07.26               */
/* 최초 작성자 : 홍길동                      */
/* 최종 수정일자 : 2022.07.26               */
/*****************************************/

public class VariableEx3 {

	public static void main(String[] args) {

		int junior = 15;  // 청소년 시작 나이 (15살)
		// adult변수를 초기화할 때 junior 변수가 초기화가 안되어있으면 프로그램 에러가 발생한다.
		int adult = junior + 5; // 성인 기준(20살)
		double radius = 5.0; // 반지름
		double interestRate = 0.1; // 이자율
		int age;
		
		age = 30;
	}

}
