package p10.abstract_method;

// 추상클래스와 추상메소드를 사용하는 목적
// 1. 부모 클래스를 추상클래스(abstract class)로 선언하고 추상메소드(abstract method)를 정의하면 부모 추상클래스가 마치 설계도만 주는 효과가 생긴다.
// 2. 실제 구현 책임은 자식 클래스에게 존재
// 3. 실제 사용할 때는 자식 클래스를 인스턴스로 만들어서 polymorphism 개념으로 사용.
public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("--------------------");
		
		Animal animal = dog; // promotion
		animal.sound();		 // polymorphism
		
		animal = cat;
		animal.sound();

		System.out.println("--------------------");

		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	// parameter에서 promotion
	public static void animalSound(Animal animal) {
		animal.sound(); // polymorphism
	}
}
