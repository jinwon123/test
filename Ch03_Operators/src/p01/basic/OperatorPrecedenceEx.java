package p01.basic;

// Operator Precedence (연산자 우선순위)
// assignment operator인 = 을 기준으로 해서
// 1. 오른쪽에 있는 수식을 계산할 때 왼쪽부터 오른쪽으로 계산.
// 2. 왼쪽부터 오른쪽으로 계산할 때 연산순위가 높은 연산자가 먼저 연산 수행.(*, /, %가 +. - 보다 연산순위가 높음)
// 3. 단, ()가 모든 연산자보다 우선순위가 제일 높음.
// 4. 프로그래밍할 때 사용할 tip : 연산순위가 제일 높은()를 적극 활용하라.
public class OperatorPrecedenceEx {

	public static void main(String[] args) {
		int result = 0;
		
		result = 5 - 2 + 3 - 6;
		System.out.println("result = " + result);
		
		result = 3 - 4/2 + 8*4 - (5+2)%3;
		System.out.println("result = " + result);

	}

}
