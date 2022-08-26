package p02.method_callbyreference_practice;

public class ArrayReverse2 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		
		System.out.print("reverse 하기 전 : ");
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();

		reverse(list);
		
		System.out.print("reverse 한 후 : ");
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		
		for (int i=0; i<list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		}
		
//		list = newList; 안된다.
		for (int i=0; i<list.length; i++) {
			list[i] = newList[i];
		}
	}

}
