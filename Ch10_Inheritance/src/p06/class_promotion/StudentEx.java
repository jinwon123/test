package p06.class_promotion;

// class에서 자동 형변환(promotion) 정의
// 1. 부모와 자식 class간에서만 발생
// 2. 자식 인스턴스를 부모 데이터 타입으로 넘길 때 발생되는 현상
// - Parent p = new Student(); 
// 3. 힙메모리 사용관점에서 보면 promotion은 자식 인스턴스가 생성한 자식과 부모 인스턴스 2개 중에서 부모 인스턴스만 사용하겠다는 의미 
// 4. 자식 인스턴스를 부모 인스턴스로 promotion하면 부모 class에서 선언된 field, method만 사용 가능하다.
public class StudentEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		
		s.printPersonInformation();
		s.printStudentInformation();
		
		p = s; // promotion 발생된다 (자식 class 인스턴스를 부모 class 인스턴스로 자동 형변환)
		// Person p; p = s; 부모(p)만 사용한다는 의미 (주소값은 s의 주소값을 가지고 있지만 p만 사용) Person 데이터타입으로 선언되어있다.
		p = new Student("김길동");
		
		p.printPersonInformation();
//		p.printStudentInformation();  // p에서는 자식 인스턴스의 method 사용 불가 

	}

}
