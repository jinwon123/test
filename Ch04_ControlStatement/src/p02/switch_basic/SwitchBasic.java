package p02.switch_basic;

// switch문은 if ~ else if ~ else 문으로 바꿀 수 있다.
// - 등급으로 나누어지는것에 switch문이 자주 쓰인다.
// - 가능하면 switch문을 많이 사용하는 것을 추천한다. 새로 추가하기도 쉽다. 제약은 있지만 편리하다.
// - 유용한 적용 사례 : 주사위, 달력, 회사직급처럼 등급이 정해져있는 경우 
public class SwitchBasic {

	public static void main(String[] args) {
		// diceNumber : 1, 2, 3, 4, 5, 6중 하나가 나온다.
		int diceNumber = (int)(Math.random()*6) + 1;
		
		System.out.println("diceNumber = " + diceNumber);
		
		switch(diceNumber) {
		case 1: // if(diceNumber == 1)랑 같은 뜻이다.
			System.out.println("주사위 1이 나왔습니다.");
			break;
		case 2: // else if(diceNumber == 2)
			System.out.println("주사위 2가 나왔습니다.");
			break;
		case 3: // else if(diceNumber == 3)
			System.out.println("주사위 3이 나왔습니다.");
			break;
		case 4: // else if(diceNumber == 4)
			System.out.println("주사위 4가 나왔습니다.");
			break;
		case 5: // else if(diceNumber == 5)
			System.out.println("주사위 5가 나왔습니다.");
			break;
//		case 6: // else if(diceNumber == 6)
		default: // else
			System.out.println("주사위 6이 나왔습니다.");
			break;
		}
		

	}

}
