package p01.basic3;

// 다른 class를 사용하 때 주로 class method를 주로 사용하고, field는 사용하지 않는것이 원칙이다. 
// - 예를 들면, Book class의 title, author field를 직접 사용하는 것 대신에
// printBookInformation() 메소드 등을 활용하여 사용한다. 
public class BookEx {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book chunHyang = new Book("춘향전");
		
		littlePrince.printBookInformation();
		chunHyang.printBookInformation();
		
		littlePrince.title = "2021년 어린왕자"; // 특히, 다른 class의 field값을 수정하는 것은 실제로는 거의 없다. 
		littlePrince.printBookInformation();
		
		
	}

}
