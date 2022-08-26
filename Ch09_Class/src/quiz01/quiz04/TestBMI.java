package quiz01.quiz04;

public class TestBMI {

	public static void main(String[] args) {
		BMI bmi = new BMI("홍길동", 76, 1.8);
		bmi.getBMI();
		System.out.println(bmi.getBMI());
		bmi.getStatus();
		System.out.println(bmi.getStatus());
		
		BMI bmi2 = new BMI("손오공", 90, 1.7);
		bmi2.getBMI();
		System.out.println(bmi2.getBMI());
		bmi2.getStatus();
		System.out.println(bmi2.getStatus());
	}

}
