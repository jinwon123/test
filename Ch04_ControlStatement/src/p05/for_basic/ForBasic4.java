package p05.for_basic;

// for문에서 증감단위가 소숫점인 경우도 사용가능
// 1. 실제 코딩에서는 비추천
// - 실수 연산은 오차가 발생하기 때문.
// 2. 사용해야 한다면, 먼저 정수로 변환하여 for문 사용하고, 마지막에 정수를 실수로 변준한다 .
public class ForBasic4 {

	public static void main(String[] args) {
		float fSum = 0.0f;
		
		for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
			fSum += i;
			System.out.println("i의 값 = " + i);
		}
		System.out.println("fSUm = " + fSum);
		
		double dSum = 0.0;
		
		for (double i = 0.01; i <= 1.0; i += 0.01) {
			dSum += i;
			
		}
		System.out.println("dSUm = " + dSum);
		

	}

}
