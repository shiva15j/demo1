package polymorphism;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.speed();
		cc.accelerator();
		cc.breaks();

		System.out.println(" ");

		Supercar sc = new Supercar();
		sc.speed();
		sc.accelerator();
		sc.breaks();
		sc.setear();
		sc.headlight();

	}

}
