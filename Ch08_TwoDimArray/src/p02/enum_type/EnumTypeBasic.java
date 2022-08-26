package p02.enum_type;

// 나중에 회사에서 프로그래밍 할때 상수를 사용하는 경우는 항상 존재
// 1. 직급 (사원, 주임, 대리, 과장, 차장, 부장)
// 2. 고객 등급 (VVIP, VIP, Super)
// final등을 사용하여 상수를 사용할 때 문제점.
// - 여러명이 한 프로젝트를 수행하면서 상수를 공유할 때 모든 사람을 강제적으로 상수를 사용하도록 하기가 어렵다. 
// enum type (enumeration, 열거타입)을 통해 모든사람이 상수를 강제적으로 사용하게 만들 수 있다. 
public class EnumTypeBasic {

	public static void main(String[] args) {
		// 상수 사용
		final double PI = 3.14159;
		final String[] jikkeup = {"사원", "주임", "대리", "과장", "차장", "부장"};

	}

}
