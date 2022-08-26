package q01.quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println( a + " + " + b + " = " + (a+b));
		System.out.println( a + " - " + b + " = " + (a-b));
		System.out.println( a + " * " + b + " = " + (a*b));
		System.out.println( a + " + " + b + " / 2" + " = " + ((a+b)/2.0));
		
		if (a < b) {
			int temp;
			temp = a;
			a = b;
			b = temp;
			System.out.println(a);
		} else {
			System.out.println(a);
		}
		if (a < b) {
			int temp;
			temp = a;
			a = b;
			b = temp;
			System.out.println(b);
		} else {
			System.out.println(b);
		}


	}

}
