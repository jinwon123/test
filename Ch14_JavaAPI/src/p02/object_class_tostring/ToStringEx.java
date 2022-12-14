package p02.object_class_tostring;

import java.util.Date;

// println(obj)메소드는 내부적으로 obj가 class의 인스턴스라면, obj.toString() 실행
// 1. Object class의 toString() method 실행결과
// - package명 + 클래스 이름 + @ + heap memory 주소 (16진수)
// 2. String, Date class는 Object class의 toString() method를 override하여 customizing
public class ToStringEx {

	public static void main(String[] args) {
		Object obj = new Object();
		String name = "홍길동";
		Date date = new Date();
		
		System.out.println(System.identityHashCode(obj));	// heap memory 주소 출력값 : 10진수
		System.out.println(System.identityHashCode(obj.toString()));
		
		System.out.println(obj.toString()); 				// toString메소드는 16진수
		System.out.println(obj); 	// obj.toString();
		
		System.out.println(name.toString());
		System.out.println(name);
		
		System.out.println(date.toString());
		System.out.println(date);
	}

}
