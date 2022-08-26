package p07.singleton_usage;

import java.util.Calendar;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // private으로 막혀있어서 사용 불가.
		Singleton s = Singleton.getInstance(); // static이기 때문에 클래스 이름을 사용하여 접근한다.
		
		s.printSingletonHello();
		
		Singleton s1 = Singleton.getInstance();
		
		if (s == s1) {
			System.out.println("같은 힙메모리 주소를 갖고 있다. 즉 같은 싱글톤 인스턴스이다.");
		} else {
			System.out.println("다른 힙메모리 주소를 갖고 있다. 즉 다른 싱글톤 인스턴스이다.");
		}
		
		// Calendar class : 날짜 정보를 제공하는 class
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());

	}

}
