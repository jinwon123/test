package p04.polymorphism2;

public class Driver {
	
	// method parameter의 data type으로 Interface를 사용할 수 있음.
	// promotion 발생 (자식 class에서 부모인 Interface type으로 변환)
	public void drive(Vehicle vehicle) {
		vehicle.run(); // polymorphism
	}

}
