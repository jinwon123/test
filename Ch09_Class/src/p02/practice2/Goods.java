package p02.practice2;

// 생성자 overloading 에서 field 이름이 틀리더라도 signature가 동일하면 overloading 할 수 없다.(중복 선언 불가)
public class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
//	Goods( int p, int nStock){
//		price = p;
//		numberOfStock = nStock;
//	}
	
	Goods(String n, int p, int nStock, int s){
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	
//	Goods(int p, int s){
//		price = p;
//		sold = s;
//	}
	
	String getName() {
		return this.name;
	}
	
	int getPrice() {
		return this.price;
	}
	
	int getNumberOfStock() {
		return this.numberOfStock;
	}
	
	int getSold() {
		return this.sold;
	}
	
	public Goods me() {
		return this; // 힙메모리에있는 인스턴스 본인을 의미한다. 
	}

}
