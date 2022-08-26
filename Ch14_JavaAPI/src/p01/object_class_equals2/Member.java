package p01.object_class_equals2;

public class Member {
	public String id;
//	public int ranking;
	
	public Member() {
		
	}
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		// Member instance가 Object type으로 promotion
		if (obj instanceof Member) {
			Member member = (Member) obj;
			
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}


}
