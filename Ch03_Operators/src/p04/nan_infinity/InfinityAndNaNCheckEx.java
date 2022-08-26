package p04.nan_infinity;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z;
		
		z = x/y; // 무한대 (Infinity)
		z = x%y; // NaN
		
		System.out.println("z = " + z);
		
		if((Double.isInfinite(z)) || (Double.isNaN(z))) {
			System.out.println("z의 값을 산출할 수 없습니다.");
		} else {
			z = z + 2;
		}
		
	}

}
