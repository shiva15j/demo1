package day4;

public class Dog {

	int tail = 1;

	String color;

	// Non Parameterized
	public Dog() {
		System.out.println("I am a Dog Constructor");
	}

	// Parameterized
	public Dog(String breed) {
		System.out.println("The Dog breed=:" + breed);
	}

	public void bark() {
		System.out.println("The Dog can bark");
	}

	public void eat() {
		System.out.println("The Dog can eat");
	}

	public void sleep() {
		System.out.println("The Dog can sleep");
	}

}
