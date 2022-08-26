package p04.datatypes_casting;

// casting의 문제점
// - 큰 data type의 값이 작은 data type으로 변환되면서 데이터가 유실된다.
public class CastingEx2 {

	public static void main(String[] args) {
		byte byteValue = 0;
		int intValue = 257;
		double doubleValue = 323.142;
		
		// 4byte 데이터를 1byte만 남기고 전부 삭제.
		byteValue = (byte) intValue;
		// 257은 byte의 최대범위를 초과하여 1byte를 제외한 모든 값을 삭제한다.
		// 257을 2진수로 표현하면 0000 0001 0000 0001 인데 1byte는 8비트만을 사용하기 때문에 앞에 0000 0001을 날리고 0000 0001만 남아서 결국 값은 1으로 나온다.
		System.out.println("byteValue = " + byteValue); 
		
		intValue = (int) doubleValue;
		// 실수형 double을 정수형 int로 강제형변환을 시행하면 소수부분이 다 삭제된다.
		System.out.println("intValue = " + intValue);
	}

}
