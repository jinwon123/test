package p01.basic;

import java.util.Scanner;

// 배열 사용해서 코딩 단순화(simplifying) 예제 
public class ArrayBasic8 {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Oct", "Sep", "Nov", "Dec"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("달력 숫자를 입력하세요 (1~12 사이 숫자)");
		int month = input.nextInt();
		
		System.out.println("이번 달은 " + months[month-1] + "입니다.");
		

	}

}
