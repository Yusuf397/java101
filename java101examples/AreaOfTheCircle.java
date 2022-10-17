package java101examples;

import java.util.Scanner;

public class AreaOfTheCircle {

	public static void main(String[] args) {

		double r, centerAngle, pi = 3.14;

		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the radius of the circle (mm): ");
		r = inp.nextDouble();
		System.out.print("Enter the center angle (degree): ");
		centerAngle = inp.nextDouble();

		double area = (pi * r * r * centerAngle) / 360;
		System.out.println(area);

	}

}
