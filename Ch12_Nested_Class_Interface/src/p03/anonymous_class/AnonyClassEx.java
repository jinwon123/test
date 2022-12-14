package p03.anonymous_class;

// 부모 class와 자식 class간에도 자식 class를 익명객체로 만들어 부모 class type으로 자동형변환(promotion)하여 사용.
public class AnonyClassEx {

	public static void main(String[] args) {
		Person p = new Student();	// promotion
		p.wake();					// polymorphism
		
		AnonyClass ac = new AnonyClass();
		
		ac.person.wake();
		
		ac.method1();
		
		// 자식 익명객체를 method2의 parameter로 넘긴다.
		ac.method2(new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}
			@Override
			void wake() {
				System.out.println("9시에 일어납니다.");
				study();
			}
		});
	}

}
