package backJun_for;

import java.util.Scanner;

public class Backjun11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] a = new int[N];
{
				for (int i = 0; i<N; i++) {
					a[i] = sc.nextInt();
					if (a[i]<X) {
						System.out.print(a[i] + " ");
				}
					
			}
		}
	}
}
