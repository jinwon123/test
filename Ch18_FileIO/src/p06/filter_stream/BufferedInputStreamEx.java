package p06.filter_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("입력 : ");
		String lineString = br.readLine();	// 한줄씩 읽기 (readLine)
		
		System.out.println("출력 : " + lineString);

	}

}
