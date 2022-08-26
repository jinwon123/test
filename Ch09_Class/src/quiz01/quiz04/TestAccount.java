package quiz01.quiz04;

public class TestAccount {
	

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setAnnuallnterestRate(4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account.getBalance()+ " " + account.getMonthlyInterestRate());
		

	}

}
