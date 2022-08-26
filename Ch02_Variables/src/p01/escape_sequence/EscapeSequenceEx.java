package p01.escape_sequence;

// escape sequence : \n(enter 역할), \t(tab 역할), \\, \", \'
// -> 특수 문자(special character)로 문자열 안에서 사용된다.
// 키보드에서 enter를 누르면 2개의 escape sequence 문자가 발생 (\n\r)
// - /n : new line (줄 바꾸기)
// - /r : carriage return (문장의 앞으로 이동시켜줌)
// 문자열(string) : "n줄 바꿈n연습" 
// 문자(character) : 'n', '한', '글', 'x'

public class EscapeSequenceEx {

	public static void main(String[] args) {
		
		System.out.println("n줄 바꿈n연습"); // \n은 키보드 enter와 동일 
		System.out.println("\n줄 바꿈\n연습");
		System.out.println("t탭키t연습"); // \t는 키보드 tab과 동일
		System.out.println("\t탭키\t연습");
		System.out.println("\\ backslash 1개 출력"); // \는 특수문자여서 다른 명령어를 실행해주기위함이다. \를 보여주기 위해선 2개를 연속으로 사용하여야한다.
		System.out.println("\\\\\\ backslash 3개 출력");
		System.out.println("큰 따옴표 \" 출력"); 
		System.out.println("작은 따옴표 \' 출력");

	}

}
