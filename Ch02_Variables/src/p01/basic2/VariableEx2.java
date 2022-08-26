package p01.basic2;

// 변수이름, class 이름 작명(naming) 규칙(rule)
// 1. 변수이름(variable naming)
// - 영문, $, _ 가 포함되는 것은 가능하다.
//   -> $, _ 로 변수이름을 는 경우는 주로 SW 제품안의 프로그램에서 사용된다.
// - 변수이름 처음에 숫자가 나오면 안된다. 하지만 중간이나 마지막에 넣는것은 가능하다.
// - 변수이름은 소문자로 시작하는 것이 관행이다.
// - 변수이름은 여러개의 단어로 구성 가능하나 두번째 단어부터의 첫글자는 대문자로 표현하는 것이 관행이다. 
//   예) interestRate -> camel notation(낙타 표기법)
// - 결론 : 변수이름 지을 때 영어로만 작명하고 여러개의 단어를 camel notation을 사용하는것이 좋다!!! 
// 2. class이름
// - 변수이름과 동일한데, 한 가지 차이점은 첫글자가 대문자로 시작한다. (실제 회사에서는 숫자나 특수문자를 사용하는 것이 좋지않다)
// 3. 변수 사용 방법
// - 변수 선언 -> 변수타입(메모리 방크기, 데이터 성격(정수, 실수...)) + 변수이름 
//   변수 선언시 초기값을 줄 수도 있다. (실제 회사에서 업무를 수행할 때 가급적 변수 선언하면서 초기값을 주는 것이 가능하면 주는 것을 추천한다.)
// - 변수 사용 -> 선언된 변수에 할당된 메모리안에 값을 새롭게 변경하거나 읽어 오는 경우이다.
public class VariableEx2 {

	public static void main(String[] args) {
		// 변수 선언 
		int count;
		double interestRate;
		double $radius;
		double _radius;
//		double %radius; 맨 앞에 특수기호는 '$', '_'만 사용가능하다.
//		double 1radius; 처음 숫자로 시작하면 안된다.
		double radius1; // 변수이름 중간이나 마지막에 숫자를 넣는것은 가능하다.
		int junior = 15; // 변수 선언과 동시에 초기값을 넣어줄 수 있다.
		// 기계어 명령어로는 
		// 1. junior 변수의 메모리에 있는 값 15를 읽어라.
		// 2. 15+5 덧셈 연산을 수행하라.
		// 3. 덧셈 연산 결과를 adult 변수의 메모리 방에 넣어라.
		int adult = junior + 5;
		
		System.out.println("junior : " + junior);
		System.out.println("adult : " + adult);
		
		// 변수 사용 
		count = 10;
		System.out.println("count : " + count);
	}

}
