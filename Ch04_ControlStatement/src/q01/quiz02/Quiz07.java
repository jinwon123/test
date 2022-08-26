package q01.quiz02;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("저축하는 금액 : ");
		double money = sc.nextDouble();
		System.out.print("1년 이자율 : ");
		double isa = sc.nextDouble();

		double monthisa = ((isa / 12) * 0.01)+1.0;
		double total = 0;

		for (int i=0; i<6; i++) {
			total = (money + total) * monthisa;
		}

		System.out.println("6개월 후의 이자와 원금을 합한 금액은 " + total + " 원 입니다.");
		

	}
}

