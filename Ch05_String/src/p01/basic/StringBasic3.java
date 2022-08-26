package p01.basic;

// 문자열에서 특정 문자를 가져오는 방법 - charAt(index) 메소드 사용 
// index가 0일때 첫번째 문자를 가리키고, index가 length(문자열전체의길이)-1 일때 마지막문자를 가리킨다.
public class StringBasic3 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		int length = message.length();
		
		char firstChar = message.charAt(0);
		char thirdChar = message.charAt(2);
		char lastChar = message.charAt(length-1);
		
		System.out.println(message + "의 첫번째 글자는 " + firstChar);
		System.out.println(message + "의 세번째 글자는 " + thirdChar);
		System.out.println(message + "의 마지막 글자는 " + lastChar);
		
		System.out.println();
		for (int i=0; i<message.length(); i++) {
			System.out.println(message + "의 " + (i+1) + "번쨰 글자는 " + message.charAt(i));
		}
	}

}
