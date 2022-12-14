package p06.string_methods;

import java.io.UnsupportedEncodingException;

// Java는 내부적으로 모든 문자를 unicode로 변환해서 관리하고 있다.
// 예를 들면 '가'의 unicode값은 \uAC00
// - unicode는 2bytes로 되어 있다.

// [문자열 encoding 및 decoding]
// 0. 일반적으로 encoding은 암호화, decoding은 암호를 해독한 것을 의미한다.
// 1. encoding : unicode를 특정 문자 set 코드로 변환 (문자 코드 set 예 : UTF-8, EUC-KR, UTF-16)
// - bytes 배열로 변환
// - '가' unicode를 UTF-8로 변환할 경우는 2bytes에서 3bytes로 변환
// - Java에서 encoding 하는 방법 예 : 
// - str.getBytes(); 			-> IDE에서 지정된 기본 encoding 방식 (eclipse에서 UTF-8로 설정함)
// - str.getBytes("EUC-KR"); 	-> EUC-KR 문자 set으로 encoding
// - str.getBytes("UTF-8");		-> UTF-8 문자 set으로 encoding
// 2. decoding : 특정 문자 set 코드로 변환된 bytes 배열을 원래 unicode 문자로 원상복구하는것.
// - Java에서 decoding하는 방법 예 : 
// - new String(b1);			-> (eclipse에서 기본으로 설정된) UTF-8로 encoding 되어 있는 것을 unicode로 decoding 
// - new String(b2, "EUC-KR");	-> EUC-KR로 encoding 되어 있는 것을 unicode로 decoding 
// - new String(b3, "UTF-8");	-> UTF-8로 encoding 되어 있는 것을 unicode로 decoding
// 3. 한글 1글자 UTF-8은 3bytes, EUC-KR은 2bytes로 encoding
// 4. 결론 : 현재 가장 보편적인 encoding 방식은 UTF-8을 사용한다. (web programming에서도 de facto standard로 인정된다)
// 5. 프로그래밍에서 encoding/ decoding 나온 원래 이유
// - 통신망을 통해 데이터를 보내고(encoding) 받을때(decoding) 사용
// - 파일을 저장(encoding)하고 읽을때(decoding) 사용
// - 항상 같은 형식으로 encoding하고 decoding해야 파일이 온전히 살아있음.
public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] b1 = str.getBytes();
		System.out.println("b1 length : " + b1.length);
		String s1 = new String(b1);
		System.out.println(s1);

		try {
			byte[] b2 = str.getBytes("EUC-KR");
			System.out.println("b2 length : " + b2.length);
			String s2 = new String(b2, "EUC_KR");
			System.out.println(s2);
			
			byte[] b3 = str.getBytes("UTF-8");
			System.out.println("b3 length : " + b3.length);
			String s3 = new String(b3, "UTF-8");
			System.out.println(s3);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Java에서 지원하지 않는 문자 encoding 방식 Exception 발생");
		}
	}

}
