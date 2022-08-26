package p02.runtime_exception;

// NullPointerException
// - String type의 인스턴스가 null일 경우 
// null 객체에 . 를 사용하여 method를 사용할 경우에 발생하는 에러
public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String data = null;
		
		// println method에서 parameter로 넘어오는 String 인스턴스가 null이면 null로 출력
//		System.out.println(data);
//		System.out.println(data.toString());

		try {
			System.out.println(data);
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer exception error 발생");
		}
	}

}
