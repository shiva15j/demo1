package condtionalstatement;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("UserName=:");

		String UserName = sc.next();

		System.out.println("Pin=:");

		int pin = sc.nextInt();

		if (UserName.equals("Punith") && pin == 1234) {

			System.out.println("Logged in");
		} else if (UserName.equals("Aftab") && pin == 6789) {
			System.out.println("Logged in");
		}

		else {
			System.out.println("Invalid Credentials");
		}

	}

}
