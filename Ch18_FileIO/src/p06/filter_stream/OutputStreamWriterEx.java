package p06.filter_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/jinwon/Desktop/code/tmp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");
		
	}

}
