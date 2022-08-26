package backJun_if;

import java.util.Scanner;

public class Backjun3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년을 입력해주세요 :");
		int nun = sc.nextInt();
		
		if (nun%4==0 && nun%100!=0 || nun%400==0) {
				System.out.println("1");
			}else {
				System.out.println(0);
			}
	
		}
	}
