package p02.datatypes_basic;

// char type : 문자 한글자를 관리하기 위한 타입 (2byte)
// 문자 예 : 'A', '가', '1', ...
// 모든 문자를 unicode로 저장함
// 1. ASCII(American Standard Code Information Interchange) code table
// - 키보드의 숫자. 영문자 (대문자/소문자), 특수기호 등에 대하여 2진수 코드로 매핑한 것이다.
// 2. Unicode 코드 테이블 : 2bytes
// - 영어 ASCII 코드 테이블을 포함한 한국어, 중국어, 일어, 독일어, 기타 동남아, 아프리카 등 전세계 언어의 문자를 코드화 한것이다.
public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;        // 10진수 정수값 입력
		char c3 = '\u0041';  // 16진수 정수값 입력, \\u : unicode를 의미한다.
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);

	}

}
