package p03.datatypes_promotion;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10; // 1byte -> 4byte
		int intValue = byteValue;
		
		System.out.println("intValue = " + intValue);
		
		char charValue = '가'; // 2byte -> 4byte
		intValue = charValue;
		
		System.out.println("intValue = " + intValue);
		
		intValue = 500;
		
		long longValue = intValue;
		System.out.println("longValue = " + longValue);
		
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);
		
		double doubleValue = longValue;
		System.out.println("doubleValue = " + doubleValue);

	}

}
