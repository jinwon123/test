package p01.practice;

public class Calculator {

	public static void main(String[] args) {
		
		for (int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
		if (args.length != 3) {
			System.out.println("Calculator 사용법 예 : 2 + 3");
			return; // method의 return type이 void 인 경우는 return값이 없는 상태로 return 가
		}
		int result = 0;
		
		switch (args[1].charAt(0)) {
		case '+' :
			// Integer.parseInt : 문자열을 숫자로 바꿔주는 method 
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-' :
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '*' :
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/' :
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			break;
		}
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);

	}

}
