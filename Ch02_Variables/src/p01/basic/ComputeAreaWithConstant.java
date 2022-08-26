package p01.basic;
import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// PI = 상수 (값을 변경할 수 없고 고정된 수)
		// 상수를 사용하는법 : 
		// 1. 변수 선언할 때 final 키워드를 변수 타입 앞에 넣는다.
		// 2. 변수 선언할 때 상수값을 넣어 준다.
		// 3. 한 번 넣어준 상수값은 수정 할수없다.
		final double PI = 3.14159;
		double radius;
		double area;
		
		// 1. 원의 반지름을 console 키보드에서 읽어오기
		System.out.println("원의 반지름을 입력하세요 : ");
		radius = input.nextDouble();
		
		area = radius * radius * PI;
		
		// 2. 원의 면적을 출력하기 (console 창에 보여주기)
		System.out.print("원의 반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");

	}

}
