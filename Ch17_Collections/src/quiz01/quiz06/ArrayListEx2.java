package quiz01.quiz06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원소 10개 입력");
		while (true) {
			list.add(sc.nextInt());
			if (list.size()>=10) {
				break;
			}
		}
		
		removeDuplicate(list);
		
	}
	public static void removeDuplicate(List<Integer> list) {
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i=0; i<list.size(); i++) {
		if (!list2.contains(list.get(i))) {
			list2.add(list.get(i));
		}
		}
		System.out.println(list2);
	}

}
