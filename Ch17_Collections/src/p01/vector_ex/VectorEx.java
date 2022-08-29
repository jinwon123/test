package p01.vector_ex;

import java.util.List;
import java.util.Vector;

// List data type의 특징
// 1. 원소 추가할 때 기본적으로 맨 마지막 원소 다음에 넣음.
// 2. 원소 삭제하면 해당 원소의 자리에 다음에 있는 원소가 하나씩 땡겨서 중간에 비어있는 자리가 없다.
// Vector<E> : E (Element의 data type)
public class VectorEx {

	public static void main(String[] args) {
		// int[] v
		Vector<Integer> v = new Vector<Integer>();
//		List<Integer> v = new Vector<Integer>();	// promotion
		
		v.add(5);	// 항상 마지막 원소 다음에 집어 넣음.
		v.add(4);
		v.add(-1);

		for (int i=0; i<v.size(); i++) {
			int n = v.get(i);	// v.get(i) == v[i]
			System.out.println(n);
		}
		System.out.println();
		
		v.add(1, 100);	// index 1 위치에 100의 값을 끼워넣기
		for (int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		System.out.println("전체 원소 갯수 : " + v.size());
		// capacity() : vector가 담을 수 있는 현재 최대 원소 갯수
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		for (int i=0; i<10; i++) {
			v.add(i+10);
		}
		System.out.println("전체 원소 갯수 : " + v.size());
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		// collection : 향상된 for문 사용 적극 권장
		for (int i : v) {
			System.out.println("원소 : " + i);
		}
	}

}
