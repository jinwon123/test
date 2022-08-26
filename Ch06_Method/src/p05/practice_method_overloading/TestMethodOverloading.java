package p05.practice_method_overloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("3과 4의 최대값 = " + max(3, 4));
		System.out.println("3.2와 5.4의 최대값 = " + max(3.2, 5.4));
		System.out.println("3.2와 5.4, 10.4의 최대값 = " + max(3.2, 5.4, 10.2));

	}
	public static int max(int num1, int num2) {
		if (num1>num2) {
			return num1; // num1의 값을 return
		} else {
			return num2;
		}
	}
	public static double max(double num1, double num2) {
		if (num1>num2) {
			return num1; 
		} else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		double result;
		
		result = max(max(num1, num2), num3);
		
		return result;
	}

}
