package p01.if_basic;

import java.util.Scanner;

public class IfBasic4 {

	public static void main(String[] args) {
//		int score = 85;
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 : ");
		int score = input.nextInt();
		
		
		if (score >= 90) {
			System.out.println("A 등급입니다.");
		} else if (score>=80) {
			System.out.println("B 등급입니다.");
		} else if (score>=70) {
			System.out.println("C 등급입니다.");
		} else if (score>=60) {
			System.out.println("D 등급입니다.");
		} else {
			System.out.println("F 등급입니다.");
		}
	}

}
