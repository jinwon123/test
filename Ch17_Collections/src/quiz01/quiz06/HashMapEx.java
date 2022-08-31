package quiz01.quiz06;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Integer> map = new HashMap<>();
		
		System.out.println("정수 입력");
		while (true) {
			int key = sc.nextInt();
				
			if (key == 0) {
				break;
			}
			
			if (map.containsKey(key)) {
				int value = map.get(key);
				value ++;
				map.put(key, value);
			} else {
				int value = 0;
				map.put(key, value);
			}
		}
		
		int maxTotal = 0;
		int maxInteger = 0;
		for(int m : map.keySet()) {
			Integer value = map.get(m);
			if(value > maxTotal) {
				maxTotal = value;
				maxInteger = m;	
			}
		}
		
		System.out.println("가장 많이 입력된 정수 : " + maxInteger +", 입력 횟수 : " + maxTotal);
	}

}
