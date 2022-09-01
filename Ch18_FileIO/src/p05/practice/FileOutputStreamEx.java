package p05.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// file copy 예제
// close 메소드 사용 순서 : new Filexxxx 생성순서의 역순
public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		String originalFileName = "/Users/jinwon/Desktop/code/house.jpg";
		String targetFileName = "/Users/jinwon/Desktop/code/tmp/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 정상적으로 완료되었습니다.");
	}

}
