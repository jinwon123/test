package p04.hashset2;

import java.util.HashSet;
import java.util.Set;

// hash function
// - 어떠한 길이의 입력값이거나 데이터타입이 틀리더라도 결과는 항상 똑같은 길이의 숫자 등으로 표현하는 함수
// y = f(x)
// f : hash function	x : 입력값	y : 출력값
// Object class의 toString method의 출력값
// - package이름 + class이름 + @ + 힙메모리주소(hash code값)
// -> hash code값은 hashCode()의 return값과 동일하다.
public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		String name1 = "김길동";
		String name2 = "김길동";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println("m1의 hashCode 리턴값 : " + m1.hashCode());
		System.out.println("m2의 hashCode 리턴값 : " + m2.hashCode());
		System.out.println(m1);
		System.out.println(m2);
		
		set.add(m1);
		set.add(m2);	// hash function 결과값인 hash code값이 동일하고 equals가 true이면 중복 저장 하지않음.
		
		System.out.println("총 원소수 : " + set.size());

	}

}
