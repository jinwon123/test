package p01.basic;

// 배열 복사 (A 배열 원소들의 값 전체를 B 배열 원소들로 값을 복사.)
public class ArrayCopy {

	public static void main(String[] args) {
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];

		// 복사 방법 1 : for문을 사용하여 단순 복사 (무식한 방법)
//		for (int i=0; i<sourceArray.length; i++) {
//			targetArray[i] = sourceArray[i];
//		}
		// 복사 방법 2 : System.arraycopy method 사용
		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
		
		for (int i=0; i<targetArray.length; i++) {
			System.out.println("targetArray[" + i + "] = " + targetArray[i]);
		}
	}

}
