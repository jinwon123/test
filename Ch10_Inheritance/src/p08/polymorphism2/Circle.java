package p08.polymorphism2;

public class Circle extends Shape {
	String name;
	
	public Circle(String name) {
		this.name = name;
	}

	@Override // annotation
	public void draw() {
		System.out.println("name : " + this.name);
	}
}
