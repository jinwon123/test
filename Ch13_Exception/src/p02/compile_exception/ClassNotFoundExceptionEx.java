package p02.compile_exception;

// Compile Exception 처리 방법
// - program source code안에 강제적으로 try ~ catch 문법을 만들어서 사용해야 한다.
public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		
		try {
			// cls : java.lang.String class의 field, constructor, method 관련 정보를 가지고 있는 인스턴스.
			// forName 메소드에서 parameter로 넘겨온 class가 없으면 ClassNotFoundException 인스턴스 발생 
		Class cls = Class.forName("java.lang.String");
		System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
