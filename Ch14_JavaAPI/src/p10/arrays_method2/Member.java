package p10.arrays_method2;

public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		int compareValue = name.compareTo(o.name); // 오름차순
//		int compareValue = -name.compareTo(o.name); // 내림차순
//		int compareValue = o.name.compareTo(name); // 내림차순
		return compareValue;
	}
}
