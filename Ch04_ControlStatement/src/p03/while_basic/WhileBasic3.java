package p03.while_basic;

public class WhileBasic3 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		// 1부터 10사이의 짝수의 합
		while (number <= 10) {
			if((number%2)==0) {
				sum += number;
				System.out.println("sum = " + sum);
			}
			number++;
		}
		System.out.println("1~10 사이의 짝수의 합 = " + sum);
		
		number = 1;
		sum = 0;
		while (number <= 10) {
			if((number%2)==1) {
				sum += number;
			}
			number++;
		}
		System.out.println("1~10 사이의 홀수의 합 = " + sum);
		
	}

}
