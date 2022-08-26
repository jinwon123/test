package p08.stringbuilder_class;

// String 문제점 : 새로운 문자열이 생길때마다 기존 문자열과 함께 힙메모리에 새로 생성된다.
// StringBuilder class : String class의 문제점을 해결
// - 문자열 연산을 하더라도 힙메모리에 한개의 문자열로 관리가 된다.
// - 내부적으로 StringBuilder class가 byte[] 배열을 넉넉한 크기로 초기에 만듬
public class StringBuilderEx {

	public static void main(String[] args) {
		// new byte[1000];
		StringBuilder sb = new StringBuilder();	// sb = " ";
		
		sb.append("Java ");
		sb.append("Programming study");
		System.out.println(sb);
		
		sb.insert(4, "2");						// 끼워넣기
		System.out.println(sb);
		
		sb.setCharAt(4, '6');					// 수정 
		System.out.println(sb);
		
		sb.replace(6, 13, "Book");				// 6~12까지 인덱스를 "Book"으로 교체
		System.out.println(sb);
		
		sb.delete(4, 5);						// 4~4까지 인덱스를 삭제
		System.out.println(sb);
		
		System.out.println("총문자수 : " + sb.length());
		System.out.println(sb.toString());
	}

}
