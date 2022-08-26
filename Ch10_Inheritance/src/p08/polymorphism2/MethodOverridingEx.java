package p08.polymorphism2;

// polymorphism 사용 방법
// 1. 부모 자식 클래스 만들고 method override시킴
// 2. 실제 코딩은 부모로 promotion시켜서 override된 method 위주로 코딩

// polymorphism 사용 목적
// 1. source code 재사용 (재활용)
// 2. source code 수정 최소화
public class MethodOverridingEx {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		
		// promotion 
		shapes[0] = new Line("Lines");
		shapes[1] = new Rect("Rects");
		shapes[2] = new Circle("Circles");
		
		for (int i=0; i<shapes.length; i++) {
//			shapes[i].draw();
			shapes[i].paint(); // override 자식껄 실행시킨다.
		}

	}

}
