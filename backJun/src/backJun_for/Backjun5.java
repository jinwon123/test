package backJun_for;

import java.util.Scanner;

public class Backjun5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 ");
		int n = sc.nextInt();
		
		for (int i=n; i>0; i--) {
			if (n<=100000) {
				System.out.println(i);
			}
		}

	}

}
