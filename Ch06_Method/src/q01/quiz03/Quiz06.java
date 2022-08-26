package q01.quiz03;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력해주세요.");
		String x = sc.nextLine();
		check(x);
	}
	public static void check(String a) {
		int count = 0;
		int count1 = 0;
		
		for (int i=0; i<a.length(); i++) {
			if (Character.isLetterOrDigit(a.charAt(i))) {
				count++;
			} 	
		}
			
		for (int j=0; j<a.length(); j++) {
			if (Character.isDigit(a.charAt(j))){
				count1++;
			}
		}
		if (count1 >= 3 && count >=10) {
			System.out.println(a + "password가 유효합니다");
	}
		else {
			System.out.println(a + "password가 유효하지않습니다.");
		}
}
}
	

