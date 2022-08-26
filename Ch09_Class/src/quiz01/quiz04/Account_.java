package quiz01.quiz04;

public class Account_ {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		}
	}

	public static void main(String[] args) {
		Account_ account = new Account_();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());

	}

}
