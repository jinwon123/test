package quiz01.quiz05;

public class Account {
	String accountNo; // 계좌번호 
	String ownerName; // 예금주이름
	public int balance; //잔액
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit (int amount) { // 예금
		this.balance += amount;
	}
	
	public int withdraw(int amount) throws Exception{ // 인출
		if (this.balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		} else {
			this.balance -= amount;
			return balance;
		}
	}

}
