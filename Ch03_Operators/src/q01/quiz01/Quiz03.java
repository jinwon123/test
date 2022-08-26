package q01.quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("매월 적금 금액과 1년 이자율을 입력해주세요.");
		int money = sc.nextInt();
		double per = sc.nextDouble();
		
		double monper = (per / 12)/100;
		double monisa = 1 + monper;
		
		double money1 = money * monisa;
		double money2 = (money + money1) * monisa;
		double money3 = (money + money2) * monisa;
		double money4 = (money + money3) * monisa;
		double money5 = (money + money4) * monisa;
		double money6 = (money + money5) * monisa;
		
		System.out.println("6개월후 이자와 원금을 합한 총 금액은 = " + money6);
	}

}
