package day3;

public class Mainclass {

	public static void main(String[] args) {
		Dog dd;

		dd = new Dog();

		dd.bark();
		dd.sleep();
		dd.eat();

		System.out.println(dd.tail);

		dd.color = "white";

		System.out.println(dd.color);

		System.out.println(" ");

		dd = new Dog("German Shpefard");

		dd.bark();
		dd.sleep();
		dd.eat();
		System.out.println(dd.tail);
		dd.color = "brown";
		System.out.println(dd.color);

	}

}
