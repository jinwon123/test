package p05.for_basic;

import java.util.Scanner;

public class ForBasic {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Java씨, 존경합니다.");
//		}
		
//		System.out.println("1부터 시작하여 합계를 구할 최종 숫자를 입력하세요.");
		System.out.println("합계를 구할 시작 숫자와 최종 숫자를 입력하세요.");
		int startNumber = input.nextInt();
		int lastNumber = input.nextInt();
		
		for(int number = startNumber; number <= lastNumber; number++) {
			sum += number;
		}
		System.out.println(startNumber + " ~ " + lastNumber + "의 합 = " + sum);
		
	}

}
