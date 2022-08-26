package p07.string_tokenizer;

import java.util.StringTokenizer;

// nextToken() : 메모리에서 해당 데이터를 제거하고 읽어오는 메소드
// - oracle 등 table에서 데이터를 읽어오거나, java collection 등 framework에서도 사용한다. 
public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();	// token으로 나눠진 전체 개수
		for (int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		st = new StringTokenizer(text, "/");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
