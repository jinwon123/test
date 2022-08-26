package p06.interface_inheritance;

// Interface 상속(inheritance)
// 1. 여러개의 부모 Interface를 상속 가능.
// 2. 부모 Interface를 상속할 때는 class처럼 extends 키워드 사용.
public interface InterfaceC extends InterfaceA, InterfaceB {
	
	void methodC();
}
