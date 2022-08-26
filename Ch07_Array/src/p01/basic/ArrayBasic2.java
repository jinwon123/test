package p01.basic;

// 배열을 for문에 사용 방법 
public class ArrayBasic2 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10, 20, 30, 40, 50, 60};
		double[] arr2 = {1.0, 2.0, 3.0, 4.0};
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.println("arr[" + i + "] : " + arr[i] + " " + sum);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
		
		// 향상된 for문 (배열 등 여러개의 원소를 가진 type에서 사용 가능)
		// arr 배열에서 첫번째 원소부터 마지막 원소의 값을 차례로 element에 넣어
		for (int element : arr) {
			System.out.print(element + " ");
		}
		for (double element : arr2) {
			System.out.print(element + " ");
		}

	}

}
