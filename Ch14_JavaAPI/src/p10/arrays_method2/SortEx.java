package p10.arrays_method2;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		int[] scores = {99, 95, 44, 97, 98};
		
		printScoresInfo(scores);
		Arrays.sort(scores);
		printScoresInfo(scores);
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		printNamesInfo(names);
		Arrays.sort(names);
		printNamesInfo(names);
		System.out.println();
		
		Member[] members = {new Member("홍길동"), new Member("박동수"), new Member("김민수")};
		printMembersInfo(members);
		Arrays.sort(members);
		printMembersInfo(members);
	}
	
	public static void printScoresInfo (int[] scores) {
		for (int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	public static void printNamesInfo (String[] names) {
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
	
	public static void printMembersInfo (Member[] members) {
		for (int i=0; i<members.length; i++) {
			System.out.print(members[i].name + " ");
		}
		System.out.println();
	}
}
