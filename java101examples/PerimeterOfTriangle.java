package java101examples;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {

		double a, b, c;

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter a side length: ");
		a = inp.nextInt();
		System.out.print("Enter a side length: ");
		b = inp.nextInt();
		System.out.print("Enter a side length: ");
		c = inp.nextInt();

		double u = (a + b + c) / 2;
		double perimeter = 2 * u;
		System.out.println(perimeter);

		double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println(area);

	}

}
