package quiz01.quiz05;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		System.out.println(" toString = " + triangle.toString() + " \ngetArea = " + triangle.getArea()
						+ " \ngetPerimeter = " + triangle.getPerimeter() + " \ngetColor = " + triangle.getColor() + 
						" \nisFilled = " + triangle.isFilled());
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("side1, side2, side3, color, 삼각형filled값을 입력해주세요.");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		String color = sc.next();
		boolean filled = sc.nextBoolean();
		
		Triangle triangle2 = new Triangle(side1, side2, side3, color, filled);
		System.out.println("toString = " + triangle2.toString() + " \ngetArea = " + triangle2.getArea()
		+ " \ngetPerimeter = " + triangle2.getPerimeter() + " \ngetColor = " + triangle2.getColor() + 
		" \nisFilled = " + triangle2.isFilled());
		

	}

}
