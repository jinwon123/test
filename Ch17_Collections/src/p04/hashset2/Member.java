package p04.hashset2;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return name.equals(member.name) && age == member.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// String의 hash code값(문자열이 동일하면 hash code값도 동일) + 정수값
		return name.hashCode() + age;
	}

}
