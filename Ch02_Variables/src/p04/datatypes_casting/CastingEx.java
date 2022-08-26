package p04.datatypes_casting;

public class CastingEx {

	public static void main(String[] args) {
		char ch = 'A';
		int number = 88;
		
		System.out.println("ch = " + ch);
		
		ch = (char) number; // (char) : int type인 number를 char type으로 강제형변환(casting)
		System.out.println("ch = " + ch);
		
		double d = 100.04;
		
		long l = (long) d; // double에서 long등 int type으로 강제형변환(casting)하면 소숫점이하 값 삭제.
		System.out.println("l = " + l);
		
		int i = (int) l;
		System.out.println("i = " + i);

	}

}
