package quiz01.quiz04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3행 4열 double 타입의 실수 값을 입력해주세요.");
		double[][] arr = new double[3][4];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		
		for (int i=0; i<arr[0].length; i++) {
			double sum = 0;
			for (int j=0; j<arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.println((i+1) + "번째 열의 합계는" + sum + "입니다.");
		}

	}

}
