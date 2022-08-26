package quiz01.quiz04;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.width = 4;
		r.height = 40;
		
		System.out.println(r.width + " " + r.height + " " + r.getArea() + " " + r.getPerimeter());
		
		Rectangle r2 = new Rectangle();
		
		r2.width = 3.5;
		r2.height = 35.9;
		
		System.out.println(r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
	}

}
