package p06.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("/Users/jinwon/Desktop/code/house.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/jinwon/Desktop/code/tmp/house.jpg");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutput 사용하지 않았을 때 : " + (end-start) + "ms");
		
		fis = new FileInputStream("/Users/jinwon/Desktop/code/house.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/jinwon/Desktop/code/tmp/house.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		bos.close();
		System.out.println("BufferedOutput 사용했을 때 : " + (end-start) + "ms");
		
	}

}
