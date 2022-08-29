package p05.restricted_generic;

public class Course<T> {
	private String name;
	private T[] students;
	double a;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];	// new로 인스턴스 만들면 모든 참조타입의 field값은 null로 setting된다. 
//		this.students = new T[capacity];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T t) {
		for (int i=0; i<students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
