package p03.methods_overloading;

// method overloading : method signature가 틀리면 overloading 가능
public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double area = 0;
		
		area = cal.areaRectangle(10);
		System.out.println("정사각형의 넓이 : " + area);
		
		area = cal.areaRectangle(10, 20);
		System.out.println("직사각형의 넓이 : " + area);

	}

}
