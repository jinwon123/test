package p05.class_class_practice;

// Class class의 newInstance() method
// 1. 힙메모리에 인스턴스를 만드려면 new를 사용하는 것이 원칙이나, newInstance() method 사용해도 힙메모리에 인스턴스 생성 가능
// - new SendAction();
// 2. new를 사용한 것과 newInstance() method 사용한 것의 차이점
// - new를 사용한 것 (source code에서 instance를 만들 class가 이미 결정)
// - newInstance() method를 사용하면 프로그램 내부에서 동적으로(가변적으로) 인스턴스를 만들 class들을 변경 가능
// - Spring framework(매우 큰 library)에서 사용하는 방식
// 3. newInstance() method 사용하면서 처리해야하는 Exception
// 3.1 InstantiationException : class가 abstract class거나 interface인 경우 Exception 발생
// 3.2 IllegalAccessException : class의 access modifier가 인스턴스를 만들 수 없는 경우 
// - 예를 들면 private constructor인 경우 Exception이 발생
public class NewInstanceEx {

	public static void main(String[] args) {
		Action action; // Action action = new SendAction();
		String sendName = "p05.class_class_practice.SendAction";
		String recvName = "p05.class_class_practice.ReceiveAction";
		String name;
		
		try {
//			name = sendName;
			name = recvName;
			Class cls = Class.forName(name); 		// 해당 클래스의 인스턴스를 만든다.
			// compile-time exception
			// action = new ReceiveAction();
			action = (Action) cls.newInstance();	// promotion
			action.execute();						// polymorphism
		} catch (ClassNotFoundException e) {
			System.out.println("해당하는 class 이름을 찾을 수 없습니다.");
		} catch (InstantiationException e) {
			System.out.println("new로 인스턴스 만드는 것이 실패하였습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("new로 인스턴스 생성할 수 없습니다.");
		}

	}

}
