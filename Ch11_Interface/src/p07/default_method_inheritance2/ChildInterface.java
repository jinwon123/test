package p07.default_method_inheritance2;

// 부모 Interface에 default method2()를 추상 메소드로 override 가능.
public interface ChildInterface extends ParentInterface {
	
	void method3();
	
	@Override
	void method2();
}
