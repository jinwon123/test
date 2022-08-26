package backJun_for;

import java.util.Scanner;

public class Backjun7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("행 개수 입력 ");
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		int sum[] = new int[t];
		
		for (int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum[i] = a+b;
			}
		for (int j=0; j<t; j++) {
			System.out.println("Case #"+(j+1)+": "+sum[j]);
			}
		}
	}


