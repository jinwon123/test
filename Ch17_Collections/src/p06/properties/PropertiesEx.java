package p06.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path=PropertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("path : " + path);
		properties.load(new FileReader(path));	// database.properties file을 읽어 힙메모리에 올리라는 의미

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
