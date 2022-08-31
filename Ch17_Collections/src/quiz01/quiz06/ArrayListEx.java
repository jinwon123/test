package quiz01.quiz06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원소 5개 입력");
		while (true) {
			list1.add(sc.nextInt());
			if (list1.size()>=5) {
				break;
			}
		}
		System.out.println("원소 5개 입력");
		while (true) {
			list2.add(sc.nextInt());
			if (list2.size()>=5) {
				break;
			}
		}
		
		System.out.println(union(list1, list2));
		
	}
	public static ArrayList<Integer> union(List<Integer> list1, List<Integer> list2) {
		list1.addAll(list2);
		return (ArrayList<Integer>) list1;
	}
}
