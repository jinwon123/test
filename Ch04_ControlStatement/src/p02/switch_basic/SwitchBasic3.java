package p02.switch_basic;

import java.util.Scanner;

// switch 문에서 case에 사용 가능한 data type
// - 정수형 data type : byte, char, short, int, long
// - string data type	
// 참고로 float, double은 사용불가.
public class SwitchBasic3 {

	public static void main(String[] args) {
//		String position = "과장";
		
		Scanner input = new Scanner(System.in);
		System.out.println("직급을 입력해주세요 :");
		String position = input.next();
		
		switch (position) {
		case "부장":
			System.out.println("급여가 700만원 입니다.");
			break;
		case "과장":
			System.out.println("급여가 500만원 입니다.");
			break;
		case "대리":
			System.out.println("급여가 400만원 입니다.");
			break;
		default:
			System.out.println("급여가 300만원 입니다.");
			break;
			
		}
	}

}
