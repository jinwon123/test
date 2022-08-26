package p02.switch_basic;

import java.util.Scanner;

public class SwitchBasic4 {

	public static void main(String[] args) {
//		char grade = 'D';
		Scanner input = new Scanner(System.in);
		System.out.println("등급을 입력해주세요 :");
		char grade = input.next().charAt(0);
		
		switch (grade) {
		case 'A':
		case 'E':
		case 'B':
			System.out.println("우수 회원입니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("일반 회원입니다.");
			break;
		}
		
//		if ((grade == 'A')||(grade == 'E')||(grade == 'B')) {
//			System.out.println("우수 회원입니다.");
//		} else if ((grade == 'D')||(grade == 'E')) {
//			System.out.println("일반 회원입니다.");
//		}
	}

}
