package p04.generic_extends;

// <T extends Number> : 
// 1. T는 부모인 Number나 자식들인 Byte, Double, Float, Integer, Long, Short class만 가능하다는 의미
// 2. primitive type의 wrapper class들만 사용 가능하다

// Double.compare(a, b) method의 return 값
// - a < b 이면 -1 return
// - a > b 이면 1 return
// - a == b 이면 0 return
public class Util {
	public static <T extends Number> int Compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		
		return Double.compare(d1, d2);
	}

}
