package q01.quiz02;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 패턴을 고르시오 a, b, c, d");
		char pa = sc.next().charAt(0);
		
		switch (pa) {
		case 'a' :
			for (int i=0; i<=5; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
			
		case 'b' :
			for (int i=0; i<=6; i++) {
				for (int j=6; j>i; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			break;
			
		case 'c' :
			for (int i=0; i<=5; i++) {
				for (int j=0; j<5-i; j++) {
					System.out.print("  ");
				}
				for (int k=0; k<=i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			break;

		default :
			for (int i=0; i<=5; i++) {
				for (int k=0; k<i; k++) {
					System.out.print("  ");
				}
				for (int j=0; j<=5-i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			break;
		}
	}
}

		