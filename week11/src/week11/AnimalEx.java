package week11;

public class AnimalEx {
	public static void main(String[] args) {
		//abstract class(instance X, extends O)
		//Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println();
		
		Animal animal1 = new Dog();
		//override method
		animal1.sound();
		
		Animal animal2 = new Cat();
		//override method
		animal2.sound();
		System.out.println();
		
		animalSound(dog);
		animalSound(new Cat());
		animalSound(animal1);
		animalSound(animal2);
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breath();

		//casting can do use child's method
		if (animal instanceof Dog) {
			System.out.println("It's maybe Dog.");
			Dog dog = (Dog)animal;
			dog.dogLife();
		}
		else if (animal instanceof Cat) {
			System.out.println("It's maybe Cat.");
			Cat cat = (Cat)animal;
			cat.catLife();	
		}
	}
}
