package quiz01.quiz05;

public class InterfacePoly {

	public static void main(String[] args) {
		Lendable[] arr = new Lendable[3];
		arr[0] = new seperatevolume("1" , "포코의 진자", "");
		arr[1] = new seperatevolume("2" , "서양의 마술사", "");
		arr[2] = new AppCDInfo("3", "Spring3.0");
		
		checkOutAll(arr,"김내리","20140709");
	}
	
	public static void checkOutAll(Lendable[] arr, String name , String date) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Lendable) {
				Lendable e = (Lendable) arr[i];			
			e.checkOut(name,date); 
			}
		
		}

	}

}
