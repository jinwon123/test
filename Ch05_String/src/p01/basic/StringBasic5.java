package p01.basic;

import java.util.Scanner;

// 문자열을 console에서 읽기
// 1. next() : space로 구분된 문자열(String) 을 읽어올 때 사용
// 2. nextLine() : 1줄 전체를 문자열로 읽어올 떄 사용
// 문자열 대소문자 변환
// 1. 문자열의 모든 문자를 대문자로 변환 : toUpperCase()
// 2. 문자열의 모든 문자를 소문자로 변환 : toLowerCase()
// next()와 nextLine()을 같이 사용하면 안됨. 
public class StringBasic5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("space로 구분된 3개의 단어를 입력하세요. ");
//		String s1 = input.next();
//		String s2 = input.next();
//		String s3 = input.next();
		
//		System.out.println("s1 = " + s1);
//		System.out.println("s2 = " + s2);
//		System.out.println("s3 = " + s3);
		
//		s3 = input.next(); // dummy용
		
		System.out.println("다음에 한 줄을 입력하고 enter key를 누르세요.");
		String s4 = input.nextLine(); // 한 line 전체 문자를 읽어 올 때 사용한다 (s4에는 enter key문자는 제외된다)
		System.out.println("s4 = " + s4);
		
		System.out.println("s4 대문자 = " + s4.toUpperCase());
		System.out.println("s4 소문자 = " + s4.toLowerCase());

	}

}
