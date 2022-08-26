package q01.quiz03;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 1글자 + 숫자 1글자 입력 (예 : I2)");
		String a1 = sc.nextLine();
		
		char firstChar = a1.charAt(0);
		char lastChar = a1.charAt(1);
		
		if (firstChar == 'I') {
			if (lastChar == '1') {
				System.out.println("정보학과 1학년 입니다.");
			} else if (lastChar == '2') {
				System.out.println("정보학과 2학년 입니다.");
			} else if (lastChar == '3') {
				System.out.println("정보학과 3학년 입니다.");
			} else if (lastChar == '4') {
				System.out.println("정보학과 4학년 입니다.");
			}
		}
		if (firstChar == 'A') {
			if (lastChar == '1') {
				System.out.println("회계학과 1학년 입니다.");
			} else if (lastChar == '2') {
				System.out.println("회계학과 2학년 입니다.");
			} else if (lastChar == '3') {
				System.out.println("회계학과 3학년 입니다.");
			} else if (lastChar == '4') {
				System.out.println("회계학과 4학년 입니다.");
			}
		}
		if (firstChar == 'C') {
			if (lastChar == '1') {
				System.out.println("컴퓨터학과 1학년 입니다.");
			} else if (lastChar == '2') {
				System.out.println("컴퓨터학과 2학년 입니다.");
			} else if (lastChar == '3') {
				System.out.println("컴퓨터학과 3학년 입니다.");
			} else if (lastChar == '4') {
				System.out.println("컴퓨터학과 4학년 입니다.");
			}
		}
		}

	}

