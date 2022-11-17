package hw8Inheritanc;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalinfo();
		// Here Animal is hierarchical inheritance

		System.out.println("\n==============================================================\n");

		Mammal mammal = new Mammal();
		// This is single inheritance
		// Here mammal is child class
		// Animal is parent class
		mammal.mammalinfo();
		mammal.animalinfo();

		System.out.println("\n================================================================\n");

		Reptile reptile = new Reptile();
		reptile.reptileinfo();
		reptile.animalinfo();

		System.out.println("\n==================================================\n");

		Birds bird = new Birds();
		bird.birdinfo();
		bird.animalinfo();

		System.out.println("\n===================================================\n");

		Dog dog = new Dog();
		dog.doginfo();
		dog.mammalinfo();
		dog.animalinfo();

		System.out.println("\n=====================================================\n");

		Snake snake = new Snake();
		snake.snakeinfo();
		snake.reptileinfo();
		snake.animalinfo();

		System.out.println("\n========================================================\n");

		Robin robin = new Robin();
		robin.robininfo();
		robin.birdinfo();
		robin.animalinfo();

		System.out.println("\n========================================================\n");

		BullDog bullDog = new BullDog();
		// this is multilevel inheritance
		bullDog.bulldogInfo();
		bullDog.doginfo();
		bullDog.mammalinfo();
		bullDog.animalinfo();

		System.out.println("\n=========================================================\n");

		Cobra cobra = new Cobra();
		cobra.cobrainfo();
		cobra.snakeinfo();
		cobra.reptileinfo();
		cobra.animalinfo();

	}
}
