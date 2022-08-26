package quiz01.quiz05;

public class Student extends Person {
	
	private int status;
	static final int FRESHMAN = 1;
	static final int SOPHOMORE = 2;
	static final int JUNIOR = 3;
	static final int SENIOR = 4;
	
	public Student(String name, String address, String phoneNo, String email, int status) {
		super(name, address, phoneNo, email);
		setStatus(status);
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		if (status == 1) { 
			this.status = FRESHMAN;
		} else if (status == 2) {
			this.status = SOPHOMORE;
		} else if (status == 3) {
			this.status = JUNIOR;
		} else {
			this.status = SENIOR;
		}
	}

	public String toString() {
		return super.toString() + " status = " + status;
	}
}
