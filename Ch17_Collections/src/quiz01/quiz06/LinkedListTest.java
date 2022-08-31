package quiz01.quiz06;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Character> Llist = new LinkedList<Character>();
		
		Llist.add(new Character('a'));
		Llist.add(new Character('b'));
		Llist.add(new Character('c'));
		
		for (int i=0; i<Llist.size(); i++) {
			System.out.print(Llist.get(i) + "\t");
		}
		
		System.out.println();
		
		Iterator<Character> iter = Llist.iterator();
		while (iter.hasNext()) {
			Character c = iter.next();
			System.out.print(c + "\t");
		}

	}

}
