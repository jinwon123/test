package p11.wrapper_class;

// primitive값이 동일하더라도 Wrapper class로 변환한 후에는 힙메모리에 인스턴스로 별도로 저장 
// wrapper class의 instance 값을 비교하는 방법
// 1. primitive type으로 변환하여 비교
// 2. wrapper class의 equals method 사용
public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;		// auto boxing 할 때 자동으로 힙메모리에 인스턴스 새로 생성 (new라고 생각하면 편하다)
		Integer obj2 = 300;
		
		System.out.println("obj1 == obj2 : " + (obj1==obj2));
		System.out.println("unboxing 후 obj1 == obj2 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("(obj1.equals(obj2) : " + obj1.equals(obj2));

	}

}
