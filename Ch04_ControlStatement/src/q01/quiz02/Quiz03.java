package q01.quiz02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			if (b>c) {
				System.out.println(c + " " + b + " " + a);
			} 
		}
		if (b>a && b>c) {
			if (a>c) {
				System.out.println(c+ " " + a + " " + b);
			}
		}
		if (c>a && c>b) {
			if (a>b) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(a + " " + b + " " + c);
			}
		}

	}

}
