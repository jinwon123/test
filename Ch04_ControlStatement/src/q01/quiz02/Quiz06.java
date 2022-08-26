package q01.quiz02;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. 0을 누르면 종료합니다. ");
		int a = 100;
		int sum = 0;
		int minus = 0;
		int plus = 0;
		
		while(a != 0) {
			a = sc.nextInt();
			if (a < 0) {
				System.out.println("음수를 입력하셨습니다.");
				sum += a;
				minus ++;
				
			}
			else if (a > 0) {
				System.out.println("양수를 입력하셨습니다.");
				sum += a;
				plus ++;
			}
		}
		System.out.println("양의 정수 숫자 = " + plus + " 음의 정수 숫자 = " + minus + " 전체 합 = " + sum + " 전체 평균값 = " + (sum/(double)(minus+plus)));

	}

}
