package p04.datatypes_casting;

public class TypeMinMaxValueEx {

	public static void main(String[] args) {
		
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE); // -128
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE); // 127
		
		System.out.println("short 최소값 : " + Short.MIN_VALUE); // -32768
		System.out.println("short 최대값 : " + Short.MAX_VALUE); // 32767
		
		System.out.println("int 최소값 : " + Integer.MIN_VALUE); // -2147483648
		System.out.println("int 최대값 : " + Integer.MAX_VALUE); // 2147483647
		
		System.out.println("long 최소값 : " + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("long 최대값 : " + Long.MAX_VALUE); // 9223372036854775807
		
		System.out.println("float 최소값 : " + Float.MIN_VALUE); // 1.4E-45
		System.out.println("float 최대값 : " + Float.MAX_VALUE); // 3.4028235E38
		
		System.out.println("double 최소값 : " + Double.MIN_VALUE); // 4.9E-324
		System.out.println("double 최대값 : " + Double.MAX_VALUE); // 1.7976931348623157E308
	}

}
