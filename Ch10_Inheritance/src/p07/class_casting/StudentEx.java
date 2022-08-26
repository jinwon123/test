package p07.class_casting;

// casting(강제형변환) 정의
// 1. 부모와 자식 클래스간에만 사용 가능
// 2. 자식 클래스타입의 변수이름(인스턴스명) = (자식클래스타입) 부모 인스턴스;
// - 예 : Student s = (Student) p;
// 3. 힙메모리 관전에서 보면 
// - p는 힙메모리에 원래 자식인스턴스와 부모인스턴스가 존재하는데 promotion에 의해서 부모인스턴스만 사용하는 경우
// - s로 casting(강제형변환)하면 부모 인스턴스뿐만 아니라, 힙메모리에 있는 자식 인스턴스도 원래대로 사용하겠다는 의미  
public class StudentEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		
		s.printPersonInformation();
		s.printStudentInformation();
		
		p = s;
		
		p.printPersonInformation();
		
		Student s1 = null;
		s1 = (Student) p; // casting
		s1.printPersonInformation();
		s1.printStudentInformation();
		
		Person p1 = new Person("홍길동");
		s = (Student) p1; // casting 
		s.printPersonInformation();
		s.printStudentInformation(); // runtime error (Exception) 발생 : student 인스턴스가 없기때문.

	}

}
