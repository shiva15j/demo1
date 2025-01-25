package day3;

public class Dog {

	// Constructor:-

	// The name of the constructor should be same as of the class name

	// The Constructor should not get call , it initliazes automatically at the time
	// of the object creation.

	// Constructor are of 3 types , default , parameterized , non parameterized

	// Attributes

	public Dog() {
		System.out.println("I am a Dog constructor");
	}

	public Dog(String breed) {
		System.out.println("The Breed of the Dog is " + breed);
	}

	String color;

	int tail = 1;

	// behaviors

	public void bark() {
		System.out.println("The dog can bark");
	}

	public void eat() {
		System.out.println("The Dog can eat");
	}

	public void sleep() {
		System.out.println("The Dog can sleep");
	}

}
