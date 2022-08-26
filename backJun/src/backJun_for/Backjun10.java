package backJun_for;

import java.util.Scanner;

public class Backjun10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			for (int j=a; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
