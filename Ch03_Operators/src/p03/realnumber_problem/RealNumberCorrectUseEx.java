package p03.realnumber_problem;

public class RealNumberCorrectUseEx {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / (double) 10;
		
		System.out.println("사과 1개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남습니다. ");

	}

}
