package q01.quiz03;

import java.util.*;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		displaySortedNumbers(a, b, c);
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		Double[] x = {num1, num2, num3};
		
		Arrays.sort(x, Collections.reverseOrder());
		for (int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
}
}
