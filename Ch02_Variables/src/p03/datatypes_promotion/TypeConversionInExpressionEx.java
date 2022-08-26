package p03.datatypes_promotion;

// 1. 정수형 산술연산(+, -, *, / 등)에서의 데이터 타입 자동컨버젼(promotion)
//  - int보다 작은 byte, char, short를 사용하여 산술연산을 수행하면 무조건 int 타입으로 자동형변환 시킨다.
// 2. long type이나 float, double등의 타입과 다른 타입이 산술연산을 수행하면 큰 데이터타입으로 자동형변환 시킨다.
public class TypeConversionInExpressionEx {

	public static void main(String[] args) {
		byte b1 = 42;
		byte b2 = 10;
		byte sum;
		int isum;
		char c1 = 20;
		char c2 = 30;
		char csum;
		
		// b1 + b2 를 수행할 때 기계어로 표현하면
		// 1. byte type인 b1을 int type으로 promotion 시킨다(즉, 1byte -> 4byte 크기로 확장시킴)
		// 2. byte type인 b2를 int type으로 promotion 시킨다
		// 3. b1 + b2 를 수행
		// 4. int type인 결과값을 byte type인 sum에 넣으려 하니 에러가 발생.
		// 컴퓨터는 기본적으로 산술연산을 할때 int 형으로 시행한다. 
		sum = (byte) (b1 + b2); // (byte) : casting (강제형변환)
		System.out.println("sum = " + sum);
		
		isum = b1 + b2;
		System.out.println("isum = " + isum);
		
		csum = (char) (c1 + c2);
		System.out.println("csum = " + csum);
		
		long l1 = 15;
		long result;
		double dresult;
		
		// 기계어로 변환
		// 1. b1 + c1 연산하여 int type으로 변환하여 메모리에 4byte로 저장
		// 2. b1 + c1의 결과값과 l1을 덧셈 연산하기 위해서는 
		//  - b1 + c1의 결과값을 8byte인 long type으로 변환하고 l1과의 덧셈 연산 수행.
		// 3. 최종값을 long type인 result에 넣음.
		result = b1 + c1 + l1;
		System.out.println("result = " + result);
		
		// long type인 l1과 double type인 0.5를 더할경우 기계어로
		// 1. l1을 double type으로 변환하고 
		// 2. 0.5를 더하여 연산결과를 double type 으로 만든다.
		dresult = l1 + 0.5;
		System.out.println("dresult = " + dresult);

	}

}
