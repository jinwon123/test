package p03.system_class;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;	// promotion
		
		for (byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10);	// 0x0A : new line
		
		for (byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
		System.err.println("System error 사용");
	}
}