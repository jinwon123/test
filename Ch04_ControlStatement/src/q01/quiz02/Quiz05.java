package q01.quiz02;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int b = 0;

		do {
			System.out.println("숫자를 입력해주세요 .");
			b = sc.nextInt();
			if (a>b) {
				System.out.println("당신의 추측한 숫자의 값이 낮습니다.");
			} 
			else if (a<b){
				System.out.println("당신의 추측한 숫자의 값이 높습니다.");
			}
		} while (a != b);
		System.out.println("숫자가 " + b + " 정확히 맞추었습니다.");
	}

}
