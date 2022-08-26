package p01.practice;

// max 구하기 
// 1. method parameter를 array를 사용하여 여러개의 값을 parameter로 넘길 수 있다.
// max method처럼 여러개의 숫자에 대하여 최대값을 구하는 여러개의 메소드를 선언(method overloading)할 필요가 없다.
// 2. parameter로 배열과 유사한 다른 표기법 -> '...' 사용한 표기법 
// - actual parameter로 배열을 사용해도 인식된다.
// - actual parameter로 primitive type을 여러개 가변적으로 넘겨도 인식된다.
public class VarArgsDemo {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int maxValue;
		int[] numbers = {1, 16, 12};
		
		maxValue = max(a,b);
		System.out.println("maxValue : " + maxValue);
		
		maxValue = max(a,b,c);
		System.out.println("maxValue : " + maxValue);
		maxValue = max(numbers);
		System.out.println("maxValue : " + maxValue);
	//	maxValue = max(15, 24, 55, 23, 15);
	//	System.out.println("maxValue : " + maxValue);
		
	}
	public static int max(int[] num) {
		int result = 0;
		result = num[0];
		for (int i=1; i<num.length; i++) {
			if (num[i]>result) {
				result = num[i];
			}
		}
		
		return result;
	}
	public static int max(int a, int b) {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}
	public static int max(int a, int b, int c) {
		int result;
		
		result = max(max(a,b),c);
		
		return result;
	}

}
