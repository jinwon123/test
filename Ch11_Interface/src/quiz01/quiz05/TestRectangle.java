package quiz01.quiz05;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(3, 4);
		Rectangle r3 = new Rectangle(3, 5);
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r2.equals(r3));
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());

	}

}
