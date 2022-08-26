package p02.inc_dec;

// increment operator : ++
// 1. n1++ == n1 + 1, ++n1 == n1 + 1
// 2. C language (C++, Java) 랑 유사하다.
public class IncrementOperatorEx {

	public static void main(String[] args) {
		int n1 = 10;
		int result;
		
		System.out.println("n1 = " + n1); // 10
		n1++; // n1 = n1 + 1 (n1 += 1)
		System.out.println("n1 = " + n1); // 11
		
		++n1; // n1 += 1
		System.out.println("n1 = " + n1); // 12
		
		result = n1++; // result = n1 -> n1 += 1
		System.out.println("result = " + result); // 12
		System.out.println("n1 = " + n1); // 13
		
		result = ++n1; // n1 +=1 -> result = n1
		System.out.println("result = " + result); // 14
		System.out.println("n1 = " + n1); // 14

	}

}
