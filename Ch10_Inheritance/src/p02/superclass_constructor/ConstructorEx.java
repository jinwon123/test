package p02.superclass_constructor;

public class ConstructorEx {

	public static void main(String[] args) {
		Child c2 = new Child(11);
		
		System.out.println("집 전화번호 : " + c2.homePhoneNumber);
		
		c2.printParentInformation();

	}

}
