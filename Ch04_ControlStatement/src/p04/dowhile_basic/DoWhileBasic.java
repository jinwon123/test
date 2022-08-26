package p04.dowhile_basic;

// do ~ while : do ~ while 내부 명령어를 무조건 1번은 실행
// - do { A; } while (조건식) -> 조건식이 true인 동안에 A를 반복 실행 (무조건 한번은 실행해서 잘 안쓴다.)
// - 참고 : while문의 내부 명령어는 한번도 실행 안할수도 있다.
public class DoWhileBasic {

	public static void main(String[] args) {
		int count = 0;
		
		do {
			System.out.println("Java씨, 존경합니다.");
			count++;
		} while (count < 10);
			
		count = 0;
		do {
			System.out.println("Java씨, 매우매우 존경합니다.");
		} while (count > 10);
		
		while (count > 10) {
			System.out.println("Java씨, 너무너무 존경합니다.");
			count++;
		}

	}

}
