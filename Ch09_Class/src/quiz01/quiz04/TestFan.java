package quiz01.quiz04;

public class TestFan {


	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.setOn(true);
		fan.setSpeed(3);
		fan.setRadius(10);
		fan.setColor("yellow");
		
		fan.printFanInformation();
		System.out.println();
		
		Fan fan2 = new Fan();
		fan2.setOn(true);
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		fan2.printFanInformation();

	}

}
