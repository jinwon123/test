package p01.basic5;

// 모든 class들은 최소한 1개의 생성자가 존재해야한다.
// - 만약에 class에서 생성자 선언한 것이 하나도 없으면, JVM이 default 생성자를 자동으로 만들어준다.
// - 하지만, default constructor외에 다른 constructor가 이미 존재하면 JVM이 default constructor를 자동으로 만들지 않는다. 
public class Student {
	String name;
	int age;
	boolean isComputerMajor;
	char gender;
	
	public Student() { // <- default(기본) constructor
		
	}
	
	public Student(String newName) {
		name = newName;
	}

}
