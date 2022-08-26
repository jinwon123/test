package q01.quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4개의 정수값을 입력해주세요 .");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((a == b) && (b == c) && (c == d) && (d == a)) {
			System.out.println("4개 정수값이 동일합니다.");
			
		} else {
			System.out.println("4개의 정수값이 동일하지 않습니다.");
		}
	}

}
