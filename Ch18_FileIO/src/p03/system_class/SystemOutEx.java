package p03.system_class;

import java.io.IOException;
import java.io.OutputStream;

// System.err : 개발자가 console창에 에러메세지를 보여줄 때 사용
// - 빨간 글씨로 출력
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
