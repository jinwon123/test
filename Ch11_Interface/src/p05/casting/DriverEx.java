package p05.casting;

public class DriverEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // promotion
		
		vehicle.run();
		
//		vehicle.checkFare();
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	}

}
