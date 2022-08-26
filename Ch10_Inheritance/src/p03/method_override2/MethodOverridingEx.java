package p03.method_override2;

// 부모와 자식 class 관계가 없는 일반 class 에서는 override된 method나 field가 있을 때 항상 자식 class의 field, method만 호출 가능.
public class MethodOverridingEx {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Line line = new Line();
		line.draw();
		
		Rect rect = new Rect();
		rect.name = "Rect_Name";
		rect.draw();
		
		Circle circle = new Circle();
		circle.draw();

	}

}
