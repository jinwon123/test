package p04.datatypes_casting;

public class ByteTypeMinMaxCheckEx {

	public static void main(String[] args) {
		int num = 130;
		
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
		
		if((num < Byte.MIN_VALUE || num > Byte.MAX_VALUE)) {
			System.out.println("byte type으로 변환할 수 없습니다.");
		} else {
			byte bNum = (byte) num;
			System.out.println("bNum = " + bNum);
		}

	}

}
