package p02.datatypes_basic;

// byte : 1 byte의 데이터값만 저장 가능( -128 ~ 127)
// byte type은 사용 권장 안한다.
public class ByteEx {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;  범위를 초과하였기 때문에 에러가 나온다
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);

	}

}
