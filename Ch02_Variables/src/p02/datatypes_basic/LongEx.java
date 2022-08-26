package p02.datatypes_basic;

// 정수 type literal : 기본은 4byte이다.
// long type literal 로 만들고 싶으면 정수값 끝에 'l', 'L'을 붙이면 되고 이때 8byte로 메모리에 만든다.
public class LongEx {

	public static void main(String[] args) {
		// 기계어 변환
		// 1. 10을 4byte로 메모리에 생성
		// 2. long type인 var1에 넣기위해 4byte로 된 것을 8byte로 확장하여 var1에 넣음.
		long var1 = 10;  //4byte 에 만듬
		long var2 = 10l; //8byte 에 만듬
//		long var3 = 100000000000; // integer(4byte)의 값을 초과하여 에러가 발생한다.
		long var3 = 100000000000l;

		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
	}

}
