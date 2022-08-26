package q01.quiz02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요.(m단위로) ");
		double ki = sc.nextDouble();
		System.out.println("몸무게를 입력해주세요.");
		double mom = sc.nextDouble();
		
		double bmi = mom/(ki*ki);
		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중 입니다.");
		} else if (bmi < 25.0) {
			System.out.println("정상 체중입니다.");
		} else if (bmi < 30.0) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("비만 입니다.");
		}

	}

}
