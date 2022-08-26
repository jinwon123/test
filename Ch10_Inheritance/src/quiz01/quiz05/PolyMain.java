package quiz01.quiz05;

public class PolyMain {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-3333", "임꺽정", 10000);
		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000, "5555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("777-22-3333", "김선달", 3000, 2000000);
		BonusPointAccount obj4 = new BonusPointAccount("000-00-00000", "김미영", 0, 0);
		
		System.out.println("계좌번호 : " + obj1.accountNo + "\n예금주 이름 : " + obj1.ownerName + "\n잔액 : " + obj1.balance);
		System.out.println("계좌번호 : " + obj2.accountNo + "\n예금주 이름 : " + obj2.ownerName + "\n잔액 : " + obj2.balance);
		System.out.println("계좌번호 : " + obj3.accountNo + "\n예금주 이름 : " + obj3.ownerName + "\n잔액 : " + obj3.balance);
		System.out.println("계좌번호 : " + obj4.accountNo + "\n예금주 이름 : " + obj4.ownerName + "\n잔액 : " + obj4.balance);
		
		obj1.deposit(3000);
		System.out.println(obj1.balance);

	}

}
