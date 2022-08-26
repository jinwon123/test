package q01.quiz03;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String a = sc.nextLine();
		System.out.println("입력 string이 " + a + "이면 전체 문자 개수는 " + countLetters(a) + "입니다. ");

	}
	public static int countLetters(String s) {

		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}

}
