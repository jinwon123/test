package p02.practice;

public class Goods {
	String name;
	int price;
	int numberOfstock;
	int sold;
	
	public Goods() {
		System.out.println("Default Constructor is called");
	}
	public static void main(String[] args) {
		Goods camera = new Goods(); // 본인 class의 인스턴스도 만드는 것이 가능하다 
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfstock = 30;
		camera.sold = 50;
		
		System.out.println("상품 이름 : " + camera.name);
		System.out.println("상품 가격 : " + camera.price);
		System.out.println("재고 수량 : " + camera.numberOfstock);
		System.out.println("팔린 수량 : " + camera.sold);

	}

}
