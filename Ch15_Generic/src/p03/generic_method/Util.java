package p03.generic_method;

// <T> Box<T> boxing(T t)
// 1. 처음에 나타난 <T>의 의미 : method 안에서 T를 data type으로 사용하겠다는 의미.
// Box<T> : method의 return data type
public class Util {

	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		
		return box;
	}
}
