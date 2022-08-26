package p08.polymorphism3;

public class Driver {
	
	// method parameter에서 promotion 발생 
	public void drive(Vehicle vehicle) {
		vehicle.run(); // polymorphism 발생 
	}

}
