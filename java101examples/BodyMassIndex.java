package java101examples;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		double length;
		int kg;
		
		Scanner inp= new Scanner(System.in);
		System.out.print("Enter your height: ");
		length=inp.nextDouble();
		System.out.print("Enter your weight: ");
		kg=inp.nextInt();

		double bmı=kg/(length*length);
		System.out.println(bmı);
		
	}

}
