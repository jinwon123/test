package p02.superclass_constructor3;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public ColorPoint(String color, int x, int y) {
		super(x, y); // 항상 super먼저 부르기.
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		super.x = x;
		super.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ",");
		super.showPoint();
	}

}
