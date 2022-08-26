package p03.reference_ex;

// null
// 1. 참조타입 변수에서만 사용 가능 (String, 배열, class, interface 등)
// 2. 주소가 없다.
// 3. 참고로 기본 타입의 초기값은 int 같은 경우 0, String 은 null 
// 4. 힙메모리의 고아 데이터들은 garbage collector program이 주기적으로 실행하면서 제거함.
public class StringEqualsEx {

	public static void main(String[] args) {
		String name = null; // 64bits address 를 0으로 setting 
		String strVar1 = "신민철"; // String literal
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2의 참조가 같음(힙메모리의 주소가 같음");
		} else {
			System.out.println("strVar1과 strVar2의 참조가 틀림(힙메모리의 주소가 틀림");
		}
		System.out.println("strVar1 힙메모리 주소 : " + System.identityHashCode(strVar1));
		System.out.println("strVar2 힙메모리 주소 : " + System.identityHashCode(strVar2));
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar2과 strVar2의 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4의 참조가 같음(힙메모리의 주소가 같음");
		} else {
			System.out.println("strVar3과 strVar4의 참조가 틀림(힙메모리의 주소가 틀림");
		}
		System.out.println("strVar3 힙메모리 주소 : " + System.identityHashCode(strVar3));
		System.out.println("strVar4 힙메모리 주소 : " + System.identityHashCode(strVar4));
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열이 같음");
		}
		
		if (name == null) {
			System.out.println("힙메모리에 저장된 데이터가 없다라는 의미");
		}
		
		strVar4 = null;
		if (strVar4 == null) {
			System.out.println("힙메모리에 저장된 데이터가 없다라는 의미 -> 원래 힙메모리에 있는 '신민철' 문자열은 부모잃은 고아 ");
		}
		}

}
