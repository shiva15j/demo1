package day2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int sum = num + num1;

		if (sum >= 0) {
			System.out.println("Sum is positive");
		}

		else {
			System.out.println("Sum is negative");
		}

	}

}
