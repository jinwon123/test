package p09.instanceof_basic;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

// instanceof 사용 문법
// 1. A instanceof B = A는 변수이름(인스턴스) B는 클래스이름
// 2. 실행결과 : A 변수(인스턴스)의 힙메모리에 B 클래스의 인스턴스가 존재하면 true return하고, 없으면 false return
public class instanceOfEx {

	public static void main(String[] args) {
		System.out.print("new Person Instance 결과 -> \t");
		printInstanceInformation(new Person());
		
		System.out.print("new Student Instance 결과 -> \t");
		printInstanceInformation(new Student());
		
		System.out.print("new Researcher Instance 결과 -> \t");
		printInstanceInformation(new Researcher());
		
		System.out.print("new Professor Instance 결과 -> \t");
		printInstanceInformation(new Professor());
	}
	
	// method parameter에서 promotion 발 
	public static void printInstanceInformation(Person p) {
		if (p instanceof Person) {
			System.out.print("Person instance ");
		}
		if (p instanceof Student) {
			System.out.print("Student instance ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher instance ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor instance ");
		}
		System.out.println();
		
	}

}
