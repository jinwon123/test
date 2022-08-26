package p07.singleton_usage;

public class Singleton {
	// 자기 자신의 class에 대한 field 선언하고 인스턴스 생성한다.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		return singleton;
	}
	
	public void printSingletonHello() {
		System.out.println("Hello, singleton instance method");
	}
	
}
