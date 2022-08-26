package p01.basic;

//원의 면적(area)를 계산하기(compute)
public class ComputeArea {

	//변수 이름작명(naming)의 최신 trend : 원래 데이터 또는 사용목적에 맞게 긴 단어를 사용한다.
	public static void main(String[] args) {
		double radius; //radius 변수 이름을 갖는 데이터 저장소 정의
		double area; //area 변수 이름을 갖는 데이터 저장소 정의
		//double pie = 3.14159; 이렇게 한번에 선언과 초기화를 동시에 할수도 있다.
		
		// 1. 입력 데이터 읽기(반지름 읽기)
		radius = 30;
		
		// 2. 원의 면적 계산하기 : 입력 데이터를 출력 데이터로 가공
		area = radius*radius*3.14159;
		
		// 3. 원의 면적을 출력하기 (console 창에 보여주기)
		System.out.print("원의 반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");
	}

}
