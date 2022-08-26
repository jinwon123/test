package p01.basic;

// Relational Operator(비교 연산자)
// 1. == (예 : a == b : a와 b의 값이 같으면 true, 틀리면 false 가짐)
// 2. != (예 : a != b : a와 b의 값이 틀리면 true, 같으면 false 가짐)
// 3. >, >=
//   (예 : a > b : a가 b보다 크면 true, 같거나 작으면 false 가짐)
//   (예 : a >= b : a가 b보다 크거나 같으면 true, 작으면 false 가짐)
// 4. <, <=
//   (예 : a < b : a가 b보다 작으면 true, 같거나 크면 false 가짐)
//   (예 : a <= b : a가 b보다 작거나 같으면 true, 크면 false 가짐)

public class RelationalOperatorEx {

	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 10;
		int a3 = 5;
		boolean bResult;
		
		System.out.println("a1 == a2 :" + (a1 == a2));
		System.out.println("a1 == a3 :" + (a1 == a3));
		
		bResult = (a1 == a2);
		System.out.println("bResult = " + bResult);
		
		bResult = (a1 == a3);
		System.out.println("bResult = " + bResult);
		
		System.out.println("a1 != a2 :" + (a1 != a2));
		System.out.println("a1 != a3 :" + (a1 != a3));
		
		System.out.println("a1 > a2 :" + (a1 > a2));
		System.out.println("a1 < a3 :" + (a1 < a3));
		
		System.out.println("a1 >= a2 :" + (a1 >= a2));
		System.out.println("a1 <= a3 :" + (a1 <= a3));

	}

}
