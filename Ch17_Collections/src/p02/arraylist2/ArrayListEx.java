package p02.arraylist2;

import java.util.ArrayList;
import java.util.List;

// List 계열 collection
// 1. 원소(element)값이 동일하더라도 중복 저장
// 2. index, 원소값으로 삭제가능
// - 삭제할 때 뒤에 있는 원소가 자동으로 삭제된 원소 위치로 이동 (땡겨짐)
// - index로 삭제할 원소가 없으면 Exception 발생
// - 원소값으로 삭제할 원소가 없으면 Exception 발생안하고 아무런 동작 안함
public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		list.add("Java");
		
		System.out.println("전체 갯수 : " + list.size());
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
