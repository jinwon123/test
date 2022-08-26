package p02.method_callbyreference;

// testArrayParameter 메소드의 parameter
// 1. number : call by value에 의해 x의 값이 1이 number로 copy
// 2. numbers : y의 값(주소 값)이 numbers 로 copy 
// - call by reference에 의해서 호출된 메소드 안에서 배열 원소값을 수정하면
// main 메소드에서 해당 배열 원소값이 수정된다.
// x 즉 number는 stack 에서 한번 나오면 날아가버리기때문에 그대로 x의 값이 출력되는 것이고
// y 는 numbers에 의해서 값이 바뀌지만 stack영역에서 주소값을 가지고 있기때문에 원소가 바뀐지는 모르고 바뀐채로 넘어온다.
public class MethodArrayParameter {

	public static void main(String[] args) {
		int x = 1;
		int[] y = new int[10];
		
		for (int i=0; i<y.length; i++) {
			y[i] = 100;
		}
		testArrayParameter(x, y);
		System.out.println("x = " + x);
		for (int i=0; i<y.length; i++) {
			System.out.println("y[" + i + "] : " + y[i]);
		}

	}
	public static void testArrayParameter(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 3333;
	}

}
