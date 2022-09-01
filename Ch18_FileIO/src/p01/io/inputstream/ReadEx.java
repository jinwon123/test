package p01.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 1. file 데이터 읽기, 쓰기할 때는 반드시 Exception 코딩해야만 한다 (throws, try ~ catch)
// - new로 file class생성할 때, read(), write(), close() 메소드 사용할 때
// 2. File 경로 지정 방법 : new FileInputStream("file path(경로)")
// - 절대 경로 : 하드디스크의 실제 파일이 존재하는 위치
// 예 ) "\\Users\\jinwon\\Desktop\\code\\java\\Ch18_FileIO\\src\\p01\\io\\inputstream\\test.txt" : MS-Windows 표기법
// 예 ) "/Users/jinwon/Desktop/code/java/Ch18_FileIO/src/p01/io/inputstream/test.txt" : UNIX/LINUX/MacOS 표기법
// - 상대 경로 : eclipse등 java 개발툴(IDE)마다 사용가이드가 차이 있음.
// 예 ) "src/p01/io/inputstream/test.txt"
// 3. read() : 1byte씩 데이터를 읽어옴, return 값이 -1이면 file에서 더 이상 읽어올 데이터가 없다는 의미
// 4. close() : 힙메모리에 생성한 FileInputStream의 인스턴스를 즉시 제거
public class ReadEx {

	public static void main(String[] args) throws IOException {
//		InputStream is = new FileInputStream("\\Users\\jinwon\\Desktop\\code\\java\\Ch18_FileIO\\src\\p01\\io\\inputstream\\test.txt");	// promotion 자식 클래스를 부모클래스로 사용
//		InputStream is = new FileInputStream("/Users/jinwon/Desktop/code/java/Ch18_FileIO/src/p01/io/inputstream/test.txt");
		InputStream is = new FileInputStream("src/p01/io/inputstream/test.txt");
		int readByte;
		
		while (true) {
			readByte = is.read();	// 1byte씩 읽	어옴
			if (readByte == -1) {	// readByte가 -1인 경우는 read 실패했다는 의미 (읽어올 데이터가 없다는 의미)
				break;
			}
			System.out.println("readByte : " + (char)readByte);
		}
		is.close();
	}

}
