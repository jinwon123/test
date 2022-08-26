package q01.quiz01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("분 을 입력해주세요.");
		int min = sc.nextInt();
		
		int hour = min / 60;
		int day = hour / 24;
		int year = day / 365;
		
		System.out.println("입력하신 분을 일의 수로 바꾸면 = " + day + "일 " + "년의 수로 바꾸면 = " + year + "년 ");

	}

}
