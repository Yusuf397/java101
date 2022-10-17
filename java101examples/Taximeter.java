package java101examples;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {

		int km;
		double perKm = 2.20;
		int openingFee = 10;

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter distance in km: ");
		km = inp.nextInt();

		double total = km * perKm;
		double totalAmount = total + openingFee;

		totalAmount = (totalAmount < 20) ? 20 : totalAmount;

		System.out.println(totalAmount);

	}

}
