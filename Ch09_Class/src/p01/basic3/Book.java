package p01.basic3;

// 1. class의 field 초기값 설정은 주로 constructor를 이용한다.
// - field를 직접 초기화할 수도 있지만, 신중하게 고려 필요.
// 2. class내에서 선언된 field들은 constructor나 method에서 직접 사용 가능.
// - new Book을 사용하여 인스턴스 만들어서 사용할 필요는 없다. 
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작가미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public void printBookInformation() {
		System.out.println("책제목 : " + title + ", 책작가 : " + author);
	}

}
