package p02.multi_type_generic;

// Generic type으로 T, M을 사용하겠다는 의미 (generic multi type)
// - generic type뿐만 아니라 일반 primitive type, 다른 class들도 사용 가능하다.
// - 대부분의 class들은 최대 3개까지의 generic type을 사용
public class Product<T, M> {
	private T kind;
	private M model;
//	private int age;					// generic data type만 쓸 필요가 없다.
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	

}
