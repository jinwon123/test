package p03.method_override;

// Method Overrides
// 1. 부모 class의 method와 자식 class의 method의 signature가 동일한 경우만 해당.
// 2. 정의 : 부모에서 정의된 method가 있는데, 자식이 동일한 method signature를 만들어 정의하면
//    부모 class의 method를 호출하는 것이 아니라, 자식 method를 호출하는 것을 말한다.
public class MethodOverridingEx {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Line line = new Line();
		line.draw();
		
		Rect rect = new Rect();
		rect.draw();
		
		Circle circle = new Circle();
		circle.draw();

	}

}
