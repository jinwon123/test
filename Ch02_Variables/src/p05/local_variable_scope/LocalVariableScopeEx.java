package p05.local_variable_scope;

// 변수(variable)의 생명주기(life cycle) : 변수가 생성되고 사용되고 소멸되는 과정
// 1. 변수의 생명(존재) 유지하는 것은 메모리에 있을 경우에만 가능
//  - 변수가 메모리에 존재해야지만, 변수의 메모리값을 읽고, 메모리값을 수정할 수 있다.
// 2. Java에서 변수의 생명 주기는 {} 안에서만 살아 있다.
//  - 예 ) parentNum 변수는 main 메소드 안에서만 살아있고 childNum 변수는 if문 안에서만 살아있다.
public class LocalVariableScopeEx {

	public static void main(String[] args) {
		int parentNum = 20;
		
		if(parentNum > 10) {
			int childNum = parentNum - 10;
			System.out.println("parentNum = " + parentNum);
			System.out.println("childNum = " + childNum);
		} 
		System.out.println("parentNum = " + parentNum);
//		System.out.println("childNum = " + childNum);  childNum변수가 if문 안에서만 존재하여 if문 밖에서는 사용불가.
		{
			int a = 20;
			System.out.println("a = " + a); // 언제든지 {}를 사용하여 값을 넣어줄 수 있다.
		}
//		a = 30; 하지만 {}를 벗어나면 사라지기 때문에 주의해야한다.
	}
//	parentNum = 30;
	
}
