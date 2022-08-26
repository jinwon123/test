package q01.quiz03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원번호를 입력해주세요 예) DDD-DD-DDDD ");
		String a = sc.nextLine();
		
		if(a.charAt(3)=='-' && a.charAt(6)=='-') {
			System.out.println(a + "는 사원 번호 형식이 맞습니다.");
		} else {
			System.out.println(a + "는 사원 번호 형식이 틀립니다.");
			
		}
		}
	}

