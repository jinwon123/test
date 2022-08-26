package p03.method_override2;

// 자식 class에서 부모 class를 override 하였더라도 명시적으로 부모 class의 인스턴스인 super객체 인스턴스 사용하여 부모 class의 field, method 호출 가능.
public class Circle extends Shape {
	String name;

	@Override // annotation
	public void draw() {
		this.name = "Circle";
		super.name = "Shape_New"; 		// 부모 class의 field 호출 
		super.draw();					// 부모 class의 method 호출
		System.out.println("name : " + this.name);
	}
}
