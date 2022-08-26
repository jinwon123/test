package p07.break_continue;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			if (input.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력한 숫자 개수는 " + num);

	}

}
