package p01.basic;

// 전체 문자열에서 일부 문자열 가져오기 : substring(startIndex, endIndex) 메소드
// 1. startIndex = 0부터 시작, 일부 문자열 가져오기에 포함
// 2. endIndex = 일부 문자열 가져오기에 불포함된다 
//  (endIndex-1의 문자까지 가져온다)
// 3. startIndex 값은 있고 endIndex 값은 있는경우
// - startIndex부터 문자열 끝까지의 데이터를 가져온다.
//  예 ) substring(0)
public class StringBasic8 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		
		System.out.println(message.substring(0, 5));
		System.out.println(message.substring(0, 7));
		System.out.println(message.substring(0, 11));
		
		System.out.println(message.substring(2, 5));
		System.out.println(message.substring(2, 7));
		System.out.println(message.substring(2, 11));
		
		System.out.println(message.substring(0));
		System.out.println(message.substring(2));

	}

}
