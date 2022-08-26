package quiz01.quiz04;

public class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle(){
		
	}
	
	public double getArea() {
		return width*height;
	}

	public double getPerimeter() {
		return (width+height)*2;
	}
}
