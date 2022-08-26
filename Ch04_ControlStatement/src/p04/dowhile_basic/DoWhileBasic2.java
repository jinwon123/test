package p04.dowhile_basic;

import java.util.Scanner;

// while문은 초기값 입력 때문에 반복해서 써야하는 구문이 있다.
// do ~ while문을 사용하는데 대표적인 case : 자판기처럼 메뉴판을 보여주고 외부에서 선택하고 종료하는 경우를 조건식으로 두는 경우.
public class DoWhileBasic2 {

	public static void main(String[] args) {
		int sum = 0;
		int input_number;
		
		Scanner input = new Scanner(System.in);
				do {
					System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 종료합니다.");
					input_number = input.nextInt();
					sum += input_number;
				} while (input_number != 0);
				System.out.println("sum = " + sum);
		
//		System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 종료합니다.");
//		input_number = input.nextInt();
//		while (input_number != 0) {
//			sum += input_number;
//			System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 종료합니다.");
//			input_number = input.nextInt();
//		}
//		System.out.println("sum = " + sum);

	}

}
