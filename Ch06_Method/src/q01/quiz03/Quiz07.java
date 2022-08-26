package q01.quiz03;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저축하는 금액 : ");
		double money = sc.nextDouble();
		System.out.print("1년 이자율 : ");
		double isa = sc.nextDouble();
		System.out.println("적금 기간 : ");
		int month = sc.nextInt();
		System.out.println("총" + month + "개월이 지난후의 적금액" + calcaulateSavings(money, isa, month));

	}
	public static double calcaulateSavings(double amount, double monthlyRate, int numOfMonths) {
 
		
		double monthisa = ((monthlyRate / 12) * 0.01)+1.0;
		double total = 0;

		for (int i=0; i<numOfMonths; i++) {
			total = (amount + total) * monthisa;
	}
		return total;

}
}
