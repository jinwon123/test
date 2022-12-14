package p09.regular_expression;

import java.util.regex.Pattern;

// 정규표현식(regular expression)
// 1. mini programming language (문법 : 이해하고 외워야 한다)
// 2. 대상 : 문자열 (String)
// 3. 사용 목적 : 특정 문자열 검색, 추출, 삭제 등 문자열 연산과 관련하여 다양한 방식으로 사용
// 4. 현재 예제 : 해당되는 pattern이 맞는지 검색
// - 예를 들면 100페이지 문서(문자열)에서 전화번호에 해당하는 모든 것을 추출하시오
// - 100페이지 문서에서 이메일 주소들만 모두 추출하시오

// 정규 표현식 (02|010)-\\d{3,4}-\\d{4} 설명
// (02|010) -> 02 or 010
// - : 무조건 '-' 문자가 나온다.
// Ms windows에서는 \d을 \\d로 표현해야 한다. -> \d (d : digit, 숫자, 0~9)
// \\d{3, 4} -> 숫자가 연속해서 3개 또는 4개까지 가능 
// \\d{4} -> 숫자가 연속해서 4개만 가능

// 정규 표현식 \\w+@\\w+\\.\\w+(\\.\\w+)? 의미
// \w : 영어 알파벳 소문자 또는 대문자 또는 숫자를 의미한다.
// + : 1개 이상
// \w+ : 1개 문자 이상
// ? : 0 또는 1번 
// \. : '.' 이 나온다.
public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-5678";
		boolean result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식이 일치합니다.");
		} else {
			System.out.println("정규식이 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.co.kr";
		result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식이 일치합니다.");
		} else {
			System.out.println("정규식이 일치하지 않습니다.");
		}

	}

}
