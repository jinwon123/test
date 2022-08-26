package q01.quiz01;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0과 1000사이의 3자리 정수를 입력해주세요 : ");
		int x = sc.nextInt();
		
		if(x < 1000 && x > 0) {
			int a = x % 10;
			int b = x / 10 % 10;
			int c = x / 100 % 10;
			System.out.println(a + b + c);
		} else {
			System.out.println("값이 범위안에 들지않습니다. 다시 입력해주세요.");
		}
		

	}

}
