package q01.quiz03;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 도시를 입력하세요. ");
		String city1 = sc.nextLine();
		System.out.println("두번째 도시를 입력하세요. ");
		String city2 = sc.nextLine();
		System.out.println("두번째 도시를 입력하세요. ");
		String city3 = sc.nextLine();
		
		if (city1.compareTo(city2)>0 && city1.compareTo(city3)>0) {
			if (city2.compareTo(city3)>0) {
				System.out.println(city1 + " " + city2 +  " " + city3);
			} else {
				System.out.println(city1 + " " + city3 +  " " + city2);
			}
		}
		else if (city2.compareTo(city1)>0 && city2.compareTo(city3)>0) {
			if(city1.compareTo(city3)>0) {
				System.out.println(city2 + " " + city1 +  " " + city3);
			} else {
				System.out.println(city2 + " " + city3 +  " " + city1);
			}
		}
		else if (city3.compareTo(city1)>0 && city3.compareTo(city2)>0) {
			if(city1.compareTo(city2)>0) {
				System.out.println(city3 + " " + city1 +  " " + city2);
			} else {
				System.out.println(city3 + " " + city2 +  " " + city1);
			}
		}

	}

}
