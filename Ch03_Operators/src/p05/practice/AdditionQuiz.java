package p05.practice;
import java.util.Scanner;

// 2개의 숫자를 프로그램 내부에서 자동 생성하여 더하기 퀴즈 문제를 내는 프로그램
public class AdditionQuiz {

	public static void main(String[] args) {
		// 1970년 1월 1일 0시 0분 0초 기준으로 현재까지 1000분의 1초 단위의 숫자를 return
		// 1day = 24 * 60 * 60 * 1000 (밀리세컨)
		long currentTimeMillissecond = System.currentTimeMillis();
		int num1 = (int) currentTimeMillissecond % 10; // num1 : 0부터 9 사이의 값. (10으로 나누면 나머직 0~9가 나옴) 정수형 1의자리 숫자를 가져옴.
		int num2 = (int) currentTimeMillissecond /10 %10; // 정수형 10의자리 숫자를 가져옴.
		
//		System.out.println("currentTimeMillisecond = " + currentTimeMillissecond);
//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);

		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 " + num1 + "과 숫자 " + num2 + "의 합계는 얼마인가? ");
	    
		int answer = input.nextInt();
		boolean bCorrect = ((num1 + num2) == answer);
		System.out.println(num1 + " + " + num2 + " = " + answer + "가 맞는가요? " + bCorrect);
	}

}
