package p05.class_class;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Class cls = circle.getClass();	// return type이 class
		
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		
		System.out.println();
		
		try {
			Class cls2 = Class.forName("p05.class_class.Circle");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			System.out.println("해당하는 class 이름이 없습니다.");
		}

	}

}
