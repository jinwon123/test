package p01.basic2;

// 자식 class에서 부모 class의 method, field 사용 가능.
// Java : 1개의 부모 class만 상속 가능 (추천)
// - C++ : 여러개의 부모 class 상속 가능 (비추천)
public class ColorPoint extends Point {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		// 자식 class에서 부모 class의 field 사용 가능.
		this.x = x;
		this.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color : " + color + ",");
		// 자식 class에서 부모 class의 method 사용 가능.
		showPoint();
	}

}
