package p01.basic;

// +, -, *, /, % : 산술연산자(arithmetic operator)
public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 3;
		int result;
		double dresult;
		
		result = a1 + a2;
		System.out.println("result = " + result); // 13
		
		result = a1 - a2;
		System.out.println("result = " + result); // 7
		
		result = a1 * a2;
		System.out.println("result = " + result); // 30
		
		result = a1 / a2; //  / : 몫을 가져온다.
		System.out.println("result = " + result); // 3
		
		result = a1 % a2; //  % : 나머지를 가져온다.
		System.out.println("result = " + result); // 1
		
		// a2를 double type로 자동형변환시킴 . 그러면 a1도 따라서 
		dresult = a1 / (double)a2;
		System.out.println("dresult = " + dresult); // 3.333333...

	}

}
