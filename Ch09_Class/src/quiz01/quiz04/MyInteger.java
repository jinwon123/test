package quiz01.quiz04;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		if (value%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (value%2==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(int number) {
		if (this.value == number) {
			return true;
		} else {
			return false;
		}
	}

}
