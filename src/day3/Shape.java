package day3;

import java.util.Scanner;

public class Shape {

	public static void rectnagle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");

		int length = sc.nextInt();

		System.out.println("Bredth=:");

		int bredth = sc.nextInt();

		int area = length * bredth;

		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void sqaure() {

		Scanner sc = new Scanner(System.in);

		System.out.println("side=:");

		int side = sc.nextInt();

		int area = side * side;

		System.out.println("The area of the Sqwaure is=:" + area);

	}

	public static void main(String[] args) {

		Shape.rectnagle();
		System.out.println(" ");
		Shape.sqaure();

	}

}
