package quiz01.quiz05;

public class Square extends GeometricObject implements Colorable {

	@Override
	public String howToColor() {
		return "모든 변을 색칠하기";
	}
	
	private double side;
	
	public Square() {
		side = 1.0;
	}
	
	public Square(double side) {
		 setColor("black");
		 setFilled(false);
		 this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return side * 4;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSide : " + side + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
	}

}
