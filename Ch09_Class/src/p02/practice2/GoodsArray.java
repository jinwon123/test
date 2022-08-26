package p02.practice2;

import java.util.Scanner;

public class GoodsArray {

	public static void main(String[] args) {
		Goods[] goodsArray;
		goodsArray = new Goods[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 가격, 수량, 판매량 입력");
		
		for (int i=0; i<goodsArray.length; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			int n = sc.nextInt();
			int sold = sc.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
		}
		
		for (int i=0; i<goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock() +" ");
			System.out.println(goodsArray[i].getSold());
		}
	}
}