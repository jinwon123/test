package p02.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// FileReader : 유니코드 1문자(영문자, 한글 모두 포함)단위로 파일에서 데이터 읽음
public class CharReaderEx {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("/Users/jinwon/Desktop/code/tmp/test.txt");
		int readData;
		
		while (true) {
			readData = r.read();
			if (readData == -1) {
				break;
			}
			System.out.print((char)readData);
		}
		r.close();
		
	}

}
