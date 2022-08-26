package p05.for_basic;

// 3개의 중첩 for문
// - 전체 실행 횟수 : 3개 이상의 중첩 for문을 사용하면 프로그램 실행 속도를 크게 저하시킬 수 있어 실무적으로 가급적 사용하지 말 것.
// - java는 1초에 1억번정도 연산을 시행함.
// - 어쩔 수 없이 사용해야만 한다면 반드시 전체 반복 횟수를 확인하고 사용할 것.
public class ForBasic3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					System.out.println(i + " * " + j + " * " + k + " = " + (i*j*k));
				}
			}
		}
		
//		for (int i = 1; i <= 10000; i++) {
//			for (int j = 1; j <= 10000; j++) {
//				for (int k = 1; k <= 10000; k++) {
//					System.out.println(i + " * " + j + " * " + k + " = " + (i*j*k));
//				}
//			}
//		}

	}

}
