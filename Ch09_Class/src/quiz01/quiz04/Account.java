package quiz01.quiz04;

public class Account {
	private int id;
	private double balance;
	private double annuallnterestRate;

	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate/100;
	}
	
	public double getMonthlyInterest() {
		return balance * (1 + getMonthlyInterestRate());
	}
	
	public double getMonthlyInterestRate() {
		return annuallnterestRate/12;
	}
	
	public void withdraw (double money) {
		this.balance -= money;
	}
	
	public void deposit (double money) {
		this.balance += money;
	}
	
	
	
}
