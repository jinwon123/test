package p02.practice_basic;

import java.util.Scanner;

// method의 제일 큰 장점
// 1. 한번 코딩해 놓으면 다른사람에게도 공유 가능(더 이상 중복된 코딩할 필요가 없다.)
// 2. method를 사용하는 사람은 method에 실제 구현 code 내용을 이해하지 않아도 얼마든지 사용가능하다. 
// 3. 개발 생산성과 코드 재활용성(reusable)이 높아진다. 
public class GreatestCommonDivisor {

	// main method 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요. ");
		int n1 = input.nextInt();
		System.out.println("두번째 정수를 입력하세요. ");
		int n2 = input.nextInt();
		
		System.out.println("입력된 정수 " + n1 + ", " + n2 + "의 최대공약수 : " + gcd(n1, n2));

	}
	// 최대 공약수 구하는 메소드 
	// 2개의 입력 정수 n1, n2에 대하여 2부터 시작하여 1씩 증가시키면서, n1과 n2 모두 나머지가 0인지 확
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;
		
		while (k<=n1 && k<=n2) {
			if (n1%k==0 && n2%k==0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
}
