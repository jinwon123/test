package p01.basic;

public class InheritEx {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "아담";
		
		p.speak();
		p.eat();
		p.sleep();
		p.walk();
		
		Student s = new Student();
		s.name = "홍길동학생";
		s.age = 20;
		s.study();
		s.speak();
		s.eat();
		s.sleep();
		s.walk();
		
		Researcher r = new Researcher();
		r.name = "강연구원";
		r.research();
		r.speak();
		r.eat();
		r.sleep();
		r.walk();
//		r.study(); -> 형제 클래스의 method, field는 사용할 수 없다.
		
		Professor pf = new Professor();
		pf.name = "안교수";
		pf.teach();
		pf.research();
		pf.speak();
		pf.eat();
		pf.sleep();
		pf.walk();
		
		StudentWorker sw = new StudentWorker();
		sw.name = "김학생워커";
		sw.work();
		sw.study();
		sw.speak();
		sw.eat();
		sw.sleep();
		sw.walk();
		

	}

}
