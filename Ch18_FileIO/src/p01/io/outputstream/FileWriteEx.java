package p01.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// FileOutputStream("write할 file 경로 지정")
// 1. File을 새로 생성할 파일 경로(path) 지정
// - 파일 경로에서 directory까지는 존재해야만 한다. 없으면 Exception 발생
// - 파일 경로에서 write할 file은 없어도 된다 (만약에 없는 경우는 새로 생성해준다)
// - 파일 경로에서 write할 file이 이미 존재한다면 기존 파일 내용 전체 삭제되고, 새로운 내용으로 업데이트한다.
// 2. write() : file에 실제로 byte단위로 write
// 3. flush() : 출력 버퍼에 있는 문자들 전체를 한번에 하드디스크의 file에 write
// 4. close() : 힙메모리의 FileOutputStream 인스턴스를 즉시 삭제
public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("/Users/jinwon/Desktop/code/tmp/test.txt");
		byte[] data = "ABC".getBytes();	// getBytes method : String -> byte[]로 변환
		
		for (int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close();

	}

}
