package q01.quiz03;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 ");
		long sum = sc.nextLong();
		
		System.out.println(sumDigits(sum));

	}
	public static int sumDigits(long n) {
		int result = 0;
		
		while(n != 0) {
			result += n%10;
			n /= 10;
		}
		
		
		return result;
	}

}
