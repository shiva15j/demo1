package day4;

public class Dogmain {

	public static void main(String[] args) {

		Dog dd = new Dog();

		System.out.println(dd.tail);

		dd.color = "white";
		System.out.println(dd.color);

		dd.bark();
		dd.eat();
		dd.sleep();

		System.out.println(" ");

		Dog fh = new Dog("BullDog");

		System.out.println(fh.tail);

		fh.color = "brown";
		System.out.println(fh.color);
		fh.bark();
		fh.eat();
		fh.sleep();

	}

}
