package p02.practice_basic;

import java.util.Scanner;

// return type이 void인 메소드 사용 사례
// - 정보 츌력용으로 사용 ( 검사 결과 출력)
public class TestVoid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		double a = printGrade(sc.nextDouble());

	}
	public static double printGrade(double score) {
		if (score > 90) {
			System.out.println("A등급 입니다.");
		} else if (score > 80) {
			System.out.println("B등급 입니다.");
		} else if (score > 70) {
			System.out.println("C등급 입니다.");
		} else if (score > 60) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
		return score;
	}

}
