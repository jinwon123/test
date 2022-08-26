package q01.quiz02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 중 숫자 0,1,2 중 하나의 숫자를 입력하세요.");
		
		int b = sc.nextInt();
		System.out.println("컴퓨터가 낸 것 " + a);
		System.out.println("내가 낸 것 " + b);
		if (a == b) {
			System.out.println("비겼습니다. 다시 실행해주세요.");
		}
		else if ((a==0) && (b==1)) {
			System.out.println("당신이 이겼습니다.");
		}
		else if ((a==0) && (b==2)) {
			System.out.println("당신이 졌습니다.");
		}
		else if ((a==1) && (b==0)) {
			System.out.println("당신이 졌습니다.");
		}
		else if ((a==1) && (b==2)) {
			System.out.println("당신이 이겼습니다.");
		}
		else if ((a==2) && (b==0)) {
			System.out.println("당신이 이겼습니다.");
		} else {
			System.out.println("당신이 졌습니다.");
		}

	}

}
