package p04.practice_callbyvalue;

public class TestCallByValue {

	public static void main(String[] args) {
		int num1 = 1; // main method의 변수 값을 가져가는게 아니라 복사해서 가져가기 때문에 main method의 변수의 값은 변하지않는다. 
		int num2 = 2;
		
		System.out.println("main method - swap전 num1 = " + num1 + ", num2 = " + num2);
		swap(num1, num2);
		System.out.println("main method - swap후 num1 = " + num1 + ", num2 = " + num2);

	}
	public static void swap(int n1, int n2) {
		
		System.out.println("swap method - swap전 n1 = " + n1 + ", n2 = " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("swap method - swap후 n1 = " + n1 + ", n2 = " + n2);
	}

}
