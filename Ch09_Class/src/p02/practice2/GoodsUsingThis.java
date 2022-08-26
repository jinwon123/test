package p02.practice2;

public class GoodsUsingThis {

	public static void main(String[] args) {
		
		Goods goods = new Goods("사이다", 200, 30, 25);
		System.out.println("goods의 주소 : " + System.identityHashCode(goods));
		System.out.println("goods의 판매 갯수 : " + goods.getSold());
		
		Goods g2 = goods.me();
		System.out.println("g2의 주소 : " + System.identityHashCode(g2));
		System.out.println("g2의 판매 갯수 : " + g2.getSold());
		
		Goods goods2 = new Goods("콜라", 200, 20, 35);
		System.out.println("goods2의 주소 : " + System.identityHashCode(goods2));
		g2 = goods2.me();
		System.out.println("g2의 주소 : " + System.identityHashCode(g2));
		
	}

}
