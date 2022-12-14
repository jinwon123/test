package p04.file_manage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManagementEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("/Users/jinwon/Desktop/code/tmp/dir/sub/sub2");
		File file1 = new File("/Users/jinwon/Desktop/code/tmp/file1.txt");
		File file2 = new File("/Users/jinwon/Desktop/code/tmp/file2.txt");
		File file3 = new File("/Users/jinwon/Desktop/code/tmp/file3.txt");
		
		if (dir.exists() == false) {
			dir.mkdirs();	// make directories 
		}
		if (file1.exists() == false) {
			file1.createNewFile();
		}
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		if (file3.exists() == false) {
			file3.createNewFile();
		}
		File tmp = new File("/Users/jinwon/Desktop/code/tmp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a    HH:mm");
		File[] contents = tmp.listFiles();
		
		System.out.println("날짜               시간              형태           크기       이름");
		System.out.println("---------------------------------");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("  \t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t " + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
