package quiz01.quiz04;

public class Printer {
	public void println(int num) {
		System.out.println(num);
	}
	public void println(boolean num) {
		System.out.println(num);
	}
	public void println(double num) {
		System.out.println(num);
	}
	public void println(String num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

	}

}
