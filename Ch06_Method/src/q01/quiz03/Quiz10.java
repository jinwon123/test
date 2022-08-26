package q01.quiz03;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int a = sc.nextInt();
		reverse(a);
	}
	public static void reverse(int number) {
		int result = 0;
		while (number != 0) {
			result = number%10;
			System.out.print(result);
			number /= 10;
		}
	}

}
