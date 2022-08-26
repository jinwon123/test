package p03.methods_overloading;

public class Calculator {
	double area;
	
	// 정사각형 넓이 
	double areaRectangle(double width) {
		return width*width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}

}
