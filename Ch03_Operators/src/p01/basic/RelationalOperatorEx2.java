package p01.basic;

// 7.28
// 1. 비교연산자를 char를 사용할 경우는 unicode 값으로 비교한다
// 2. 실수값들에 대하여 비교연산자를 절대 사용하지 말것. (오차가 있기때문)
//  -> 꼭 사용해야 된다면 실수를 정수화 한 후에 사용할 것.
public class RelationalOperatorEx2 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		
		boolean bResult = (ch1 < ch2);
		System.out.println("bResult = " + bResult);
		
		double d1 = 0.1;
		float f1 = 0.1f;
		
		bResult = (d1 == f1);
		System.out.println("bResult = " + bResult);
		
		bResult = (d1 == 0.1);
		System.out.println("bResult = " + bResult);
		
		bResult = ((float)d1 == f1);
		System.out.println("bResult = " + bResult);
		

	}

}
