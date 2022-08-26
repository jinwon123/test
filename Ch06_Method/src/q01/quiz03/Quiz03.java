package q01.quiz03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 문자열을 입력하시오.");
		String a = sc.nextLine();
		System.out.println("두번째 문자열을 입력하시오.");
		String b = sc.nextLine();
		
		if (a.toLowerCase().indexOf(b.toLowerCase())>=0) {
			System.out.println(b + "는 " + a + "의 substring입니다.");
		} else {
			System.out.println(b + "는 " + a + "의 substring이 아닙니다.");
		}
	}

}
