package q01.quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 실수를 입력해주세요.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if((0 < a && a < 1)&&(0 < b && b < 1)) {
				System.out.println("두 수 모두 0과 1 사이에 있습니다.");
		} else {
			System.out.println("두 수 모두 0과 1 사이에 있지 않습니다.");
		}
	}
}
