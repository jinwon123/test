package quiz01.quiz06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz06_ex {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		while (true) {
			System.out.println("정답을 입력해주세요.");
			int answer = sc.nextInt();
			if (answer == (number1+number2)) {
				System.out.println("정답입니다.");
				break;
			} else {
				if (set.contains(answer)) {
					System.out.println("중복된 답입니다.");
					continue;
				} else {
					set.add(answer);
					System.out.println("정답이 아닙니다 다시 입력해주세요.");
				}
			}
			
		}

	}

}
