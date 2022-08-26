package backJun_for;

import java.util.Scanner;

public class Backjun1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 ");
		int a = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}

	}

}
