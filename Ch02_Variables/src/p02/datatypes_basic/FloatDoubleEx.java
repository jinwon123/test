package p02.datatypes_basic;

// 실수값 literal의 기본 type은 double이다.
// - 실수 literal을 float type에 넣을 경우에는 literal 값 끝에 'f'를 붙인다.
// 예 ) 3.14f의 의미 : 3.14값을 float type인 4bytes로 생성해 달라는 명령어
public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14;  float형은 뒤에 f(F)를 적어줘야 컴퓨터가 알아먹는다. 3.14 = 8byte라 float(4byte)에 넣을 수 없다.
		float var3 = 3.14f;
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;
		
		System.out.println("var1 = " + var1);
//		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);
		
		double var6 = 3e6;  // 3*10^6 , e(E) = Exponential (지수)
		float var7 = 3e6f;
		double var8 = 2e-3; // 3*10^(-3)
		
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);

	}

}
