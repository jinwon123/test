package quiz01.quiz05;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("홍길동", "112-1", "1111-1111", "ggg.naver.com");
		Student s = new Student("김길동", "112-2", "2222-2222", "ddd.naver.com", 1);
		Employee e = new Employee("박길동", "112-3", "3333-3333", "ddd.gmail.com", 2, 4);
		Faculty f = new Faculty("이길동", "112-4", "4444-4444", "fff.gmail.com", 5, 3, "2시간", "1등");
		Staff st = new Staff("진길동", "112-5", "5555-5555", "fff.naver.com", 4, 5, "몰라");
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());


	}

}
