package backJun_if;

import java.util.Scanner;

public class Backjun4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 x를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("두번쨰 정수 y를 입력해주세요 : ");
		int b = sc.nextInt();
		
		if (a>0 && b>0) {
			System.out.println("1");
		}
		else if (a>0 && b<0) {
			System.out.println("4");
		}
		else if (a<0 && b>0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}

	}

}
