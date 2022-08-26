package p04.final_class;

import java.util.Scanner;

// final class : 자식 class를 만들지 말라는 의미.
// - 대표적인 사용 예 : Java library class 
public final class Car {
	Scanner input;
	public int speed = 0;
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	public void stop() {
		speed = 0;
	}

}
