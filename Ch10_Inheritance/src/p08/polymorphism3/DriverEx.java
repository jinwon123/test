package p08.polymorphism3;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v;

		Bus bus = new Bus();
//		v = bus; // promotion
		
//		v = new Bus();
//		v = new Taxi();
//		v = new Sedan();
		
		driver.drive(bus);
		
		driver.drive(new Taxi());
		driver.drive(new Sedan());

	}

}
