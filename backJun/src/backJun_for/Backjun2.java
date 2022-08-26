package backJun_for;

import java.util.Scanner;

public class Backjun2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요 .");
		
		for (int i=0; i<5; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}
