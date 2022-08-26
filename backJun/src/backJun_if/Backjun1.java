package backJun_if;

import java.util.Scanner;

public class Backjun1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("<<");
		}
		else if (a > b) {
			System.out.println(">>");
		} else {
			System.out.println("==");
		}

	}

}
