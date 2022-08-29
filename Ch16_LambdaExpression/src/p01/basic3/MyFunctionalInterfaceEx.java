package p01.basic3;

// 람다표현식 사용 규칙
// 1. 추상메소드의 parameter 개수가 1개이면 () 제거 가능
public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFuctionalInterface fi;
		
		fi = (x) -> {
			int result = x*5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(5);
		
		fi = x -> System.out.println(x*5);
		fi.method(5);
	}

}
