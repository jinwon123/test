package p01.if_practice;

import java.util.Scanner;

// 뺄셈 퀴즈 : 2개의 정수로부터 뺄셈 연산수행 
// 1. 결과값을 항상 양의 정수로 출력하고 싶음. : num1 - num2 (num1, num2가 있을 때 항상 num1이 num2 보다 커야함)
// 2. 2개의 정수값 0~9 사이의 숫자
public class SubtractQuiz {

	public static void main(String[] args) {
		// Math.random() -> 0 ~ 0.9999999사이의 실수값을 랜덤으로 넘긴다.
		// Math.random()*10; -> 0 ~ 9.99999999사이의 실수값을 랜덤으로 넘긴다.
		// (int) Math.random()*10 -> 0, 1, 2, ..., 9 사이의 정수값을 랜덤으로 넘긴다.
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		if (num1 < num2) {
			// 2개의 숫자를 바꾸는 로직.(swapping)
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("num1이 " + num1 + "이고 " + "num2가 " + num2 + "인 경우 num1 - num2의 값은 ?");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if ((num1 - num2) == answer) {
			System.out.println("예 맞습니다. ");
		} else {
			System.out.println("안타깝지만 틀리셨습니다. ");
			System.out.println(num1 + "-" + num2 + "는 " + (num1 - num2) + "이어야 합니다.");
		}

	}

}
