package p08.polymorphism2;

public class Line extends Shape {
	
	public Line(String name) {
		this.name = name;
	}
	
	@Override // annotation
	public void draw() {
		System.out.println("name : " + name);
	}

}
