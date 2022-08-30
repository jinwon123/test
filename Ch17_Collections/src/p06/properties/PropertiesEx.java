package p06.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Properties class : Map collection에 속한 class (Map의 특수한 형태)
// - key, value 모두 String type이다.
// - Map<String, String>과 동일하다.
// 1. file extension이 properties인 별도 파일로 관리가 된다.
// 2. 파일내에는 key=value 형태로 저장이 되어 있음
// 3. 사용 용도 : 프로그램 외부에서 프로그램 내부에 필요한 환경설정 정보를 관리하는 목적
// - 예를 들면 현재 database.properties의 value는 oracle DBMS 환경 정보를 넣고 있는데 MySQL등 다른 DBMS에 대한 환경정보로 변경할 수가 있음.
// - 하지만 database.properties의 환경정보만 바뀌면 프로그램 내부에서는 source code 변경없이 oracle, MySQL등 DBMS를 접속하여 사용할 수 있다.
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
