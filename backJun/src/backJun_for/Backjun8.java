package backJun_for;

import java.util.Scanner;

public class Backjun8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int [a];
		int[] c = new int [a];
		int[] sum = new int [a];
		
		for (int i=0; i<sum.length; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			sum[i] = b[i] + c[i];
		}
		
		for (int i=0; i<sum.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + b[i] + " + " + c[i] + " = " + sum[i]);
		}

	}

}
