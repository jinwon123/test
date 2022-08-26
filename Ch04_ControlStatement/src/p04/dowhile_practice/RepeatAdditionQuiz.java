package p04.dowhile_practice;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random()*10);
		int number2 = (int) (Math.random()*10);
		
		Scanner input = new Scanner(System.in);
		
		int answer = Integer.MAX_VALUE; // 정수 최대값 초기화 
		
		do {
			System.out.println(number1 + "과 " + number2 + "의 합계는? ");
			answer = input.nextInt();
			if((number1 + number2) != answer) { // do ~ while문은 무조건 한번은 실행하기때문에 처음에 정답을 맞출시 프린트문이 나와서 if문으로 막아준다.
				System.out.println("정답이 아닙니다. 다시 시도해 보세요.");
			}
		} while ((number1 + number2) != answer);
		System.out.println("정답입니다. ");

	}

}
