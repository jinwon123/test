package p05.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// new FileWriter (File file, boolean append)
// - append가 true이면, 기존 파일을 삭제하지 않고, 기존 파일의 끝에 새로운 내용 추가
public class FileOutputWriterEx {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/jinwon/Desktop/code/tmp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로 된 \r\n");
		fw.write("문자열을 바로 출력할 수 있습니다. \r\n");
		fw.flush();
		fw.close();
		System.out.println("file.txt 파일이 저장되었습니다.");
	}

}
