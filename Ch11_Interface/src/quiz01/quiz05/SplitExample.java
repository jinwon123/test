package quiz01.quiz05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] splited = str.split(",");
		for (int i=0; i<splited.length; i++) {
			System.out.println(splited[i]);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int countTokens = st.countTokens();	// token으로 나눠진 전체 개수
		for (int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
