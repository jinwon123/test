package p01.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteEx2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("/Users/jinwon/Desktop/code/tmp/test.txt");
		byte[] data = "ABCDE".getBytes();
		
//		os.write(data, 1, 2);
		os.write(data);
		
		os.flush();
		os.close();

	}

}
