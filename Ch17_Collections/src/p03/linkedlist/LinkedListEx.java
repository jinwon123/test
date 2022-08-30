package p03.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1. LinkedList는 원소가 빈번히 추가, 삭제되는 application에 사용하는것을 권장한다.
// - 예 : 증권 주식 주문(증권 어플리케이션)
// 2. ArrayList는 원소가 빈번히 추가, 삭제되면 속도가 느려지는 단점이 있다.
// - 주로 원소 생성 후 조회가 많은 application에서 사용하는 것을 권장 (박물관 시스템)
// - vector보다는 ArrayList가 처리 속도가 일반적으로 빨라 ArrayList를 많이 사용한다.
public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// integer값을 String으로 변환
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns"); 
	}

}
