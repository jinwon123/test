package p04.static_constant_variable;

// field
// 1. instance field
// - heap memory에서 생성된 인스턴스 안에 있는 field
// - 항상 인스턴스를 생성한 후 인스턴스를 통해 field 사용해야만 함 
// 2. static field ('static' 키워드가 붙어있는 field)
// - heap memory의 인스턴스 안에 존재하지 않음. 별도 다른 메모리 영역에 보관된다.
// - new로 인스턴스를 여러개 만들더라도 오직 1개만 존재한다.
// - program application 전체에서 공통으로 사용되는 변수 (변수값은 변경가능)
// (예를 들면 version application에서 공통으로 사용하는 folder directory)
// - 클래스 이름으로 static field를 사용하는것이 원칙이다. (예 : Earth.EARTH_RADIUS)
// - 물론 new로 인스턴스를 생성하여 static field 
// 3. static final을 같이 사용 경우 : 상수(constant)
// - 상수는 한개만 필요한데 만약 final만 사용할 경우 인스턴스마다 상수가 반복 생성되고 
// 항상 인스턴스 생성후에 상수를 사용해야만 하는 문제 발생 
// -> 상수는 메모리에 오직 한개만 생성이 되면 되기 떄문에 static final을 사용할 것을 권장한다.  
public class Earth {
	static final double EARTH_RADIUS = 6400; // static field	
	static final double EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	
	int age; // instance field

}
