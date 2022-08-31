package quiz01.quiz06;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("복숭아");
		list.add("포도");
		list.add("참외");
		list.add("사과");
		list.add("바나나");
		list.add("키위");
		list.add("포도");
		list.add("포도");
		
		System.out.println("요소 갯수 : " + list.size());
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}

}
