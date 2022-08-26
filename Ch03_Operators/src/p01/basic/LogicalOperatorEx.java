package p01.basic;

// Logical Operator(논리연산자)
// 1. &&  (AND) 둘다 참이면 참. 하나라도 거짓이면 거짓 
// 2. ||  (OR)  둘중 하나만 참이여도 참 둘다 거짓이면 거짓 
// 3. !   (NOT) 반대로 
public class LogicalOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 20;
		int a3 = 20;
		int a4 = 0;
		boolean bResult;
		
		bResult = (a1 < a2) && (a2 == a3);
		System.out.println("bResult : " + bResult);
		
		bResult = (a1 < a2) || (a2 == a3);
		System.out.println("bResult : " + bResult);
		
		bResult = (a1 > a2) && (a2 == a3);
		System.out.println("bResult : " + bResult);
		
		bResult = (a1 > a2) || (a2 == a3);
		System.out.println("bResult : " + bResult);
		
		bResult = !(a1 > a2);
		System.out.println("bResult : " + bResult);

	}

}
