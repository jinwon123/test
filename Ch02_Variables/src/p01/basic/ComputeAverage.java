package p01.basic;
import java.util.Scanner;

// 3개의 데이터를 키보드에서 입력받아, 평균값 구하기.
public class ComputeAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1. 3개의 데이터를 console에서 읽기.
		System.out.println("3개의 데이터를 입력해주세요 : ");
		
		// console에서 여러개의 데이터를 입력할때 space로 구분하거나 enter로 구분함.
		// enter를 사용해야만 프로그램 내부에서 반응한다. space를 사용하면 중간에 프린트문(1,2,3)이 나오지않고 한번에 처리된다.
	    double number1 = input.nextDouble();
	    System.out.println("number1 : " + number1); // (1)
	    double number2 = input.nextDouble();
	    System.out.println("number2 : " + number2); // (2)
	    double number3 = input.nextDouble();
	    System.out.println("number3 : " + number3); // (3)
	    
	    // 2. 3개의 데이터를 가지고 평균값 구하기.
	    double average = (number1 + number2 + number3) / 3;
	    
	    // 3. console에 평균값 display 
	    System.out.print(number1 + ", " + number2 + ", " + number3 + "의 데이터값의 평균은 " + average + "입니다." );
		

	}

}
