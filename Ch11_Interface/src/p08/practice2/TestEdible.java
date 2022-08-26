package p08.practice2;

// a instanceof b
// - b에 올 수 있는것이 class, abstract class, interface 다 가능하다.
public class TestEdible {

	public static void main(String[] args) {
		Object[] obj = {new Tiger(), new Chicken(), new Orange(), new Apple()}; // promotion (자동형변환)
		
		for (int i=0; i<obj.length; i++) {
			if (obj[i] instanceof Edible) {
				Edible e = (Edible) obj[i]; 	// casting
				System.out.println(e.howToEat()); // polymorphism
			}
			
			if (obj[i] instanceof Animal) {
				Animal a = (Animal) obj[i];
				System.out.println(a.sound());
			}
		}
		
	}

}
