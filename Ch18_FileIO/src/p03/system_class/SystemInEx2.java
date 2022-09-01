package p03.system_class;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		byte[] data = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(data);
		String name = new String(data, 0, nameBytes-1);	// 엔터를 치기때문에 -2를 해준다.
		
		System.out.print("하고 싶은 말 : ");
		int commentBytes = is.read(data);
		String comment = new String(data, 0, commentBytes-1);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고싶은 말 : " + comment);
	}

}
