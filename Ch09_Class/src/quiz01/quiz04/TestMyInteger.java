package quiz01.quiz04;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger my = new MyInteger(7);
		System.out.println(my.getValue());
		System.out.println(my.isEven());
		System.out.println(my.isOdd());
		System.out.println(my.equals(7));
		
		MyInteger my2 = new MyInteger(26);
		System.out.println(my2.getValue());
		System.out.println(my2.isEven());
		System.out.println(my2.isOdd());
		System.out.println(my2.equals(7));

	}

}
