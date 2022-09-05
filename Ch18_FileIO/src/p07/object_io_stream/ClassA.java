package p07.object_io_stream;

import java.io.Serializable;

// Class로 선언된 인스턴스(new로 힙메모리에 생성)는 기본적으로 file에 read/write가능하고, 네트워크에 송수신 가능
// - field만 가능 (생성자, 메소드는 제외)
// - filed에서도 static은 제외
// - transient는 Serializable interface를 implement한 class에서 사용
// -> file에 write하거나 network에서 data 송수신 대상에서 제외할 목적으로 사용 (예를들면 password를 관리하는 field인 경우)
// file에 read/write 또는 network상에 data 송수신용으로 사용할 class를 Serializable interface로 선언한 이유
// 1. ObjectOutputStream을 사용하여 write할 떄 byte단위로 직렬화 (serialization) -> file에 write할 때 encoding하는 것도 동일
// 2. ObjectInputStream을 사용하여 read할 때는 byte단위로 되어 있는것을 원래의 class 인스턴스로 변환 (decoding)하는 역직렬화 수행(reverse serialization)
// 3. 송수신할 클래스를 변경하는 것을 막기 위해서 또는 변경되지 않았다는 것을 guarantee하기 위해서 Serializable로 선언한 것이다.
// 4. serialVersionUID = 4641626255760256711
// -> UID는 class가 변경될 떄마다 (filed 등) 새로 생성되는 난수
// 5. 만약 class에서 serialVersionUID를 명시적으로 값을 부여하면, class에서 field가 추가되는 등의 변화가 있더라도 file read/write나,
// 데이터 송수신할 때 에러발생 안한다.
public class ClassA implements Serializable {
	static final long serialVersionUID = 1;
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	int filed5;

}	
