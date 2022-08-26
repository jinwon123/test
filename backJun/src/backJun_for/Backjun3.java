package backJun_for;

import java.util.Scanner;

public class Backjun3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
