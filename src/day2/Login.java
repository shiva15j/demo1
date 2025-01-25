package day2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Username=:");

		String username = sc.next();

		System.out.println("pin=:");

		int pin = sc.nextInt();

		if (username.equals("Vimal") && pin == 1234) {
			System.out.println("Logged In");
		} else {
			System.out.println("Inalid Username");
		}

	}

}
