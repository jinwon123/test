package p12.random_class;

import java.util.Random;

// Math.random() -> 0 ~ 0.999999사이의 값을 return
// Random class가 별도로 존재
// nextInt(45) -> (int)(Math.random()*45) --> 0 ~ 44
// * Random(seed) -> seed값이 같으면 결과값도 똑같이 나온다.
public class RandomEx {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(5);
		
		System.out.println("선택번호 : ");
		for (int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	// 1 ~ 45값 랜덤으로 return
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		int[] winNumber = new int[6];
		random = new Random(5);
		
		System.out.println("당첨번호 : ");
		for (int i=0; i<6; i++) {
			winNumber[i] = random.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
	}

}
