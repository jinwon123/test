package quiz01.quiz05;

public class CreditLineAccount extends Account {
	public int creditLine;
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	public int withdraw (int amount) throws Exception{
		if((balance + creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		} else {
			balance -= (balance + creditLine - amount);
			return balance;
		}
	}

}
