package java101examples;

import java.util.Scanner;

public class VatAmount {

	public static void main(String[] args) {

		double amount, vatRatio;

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter pay amount: ");
		amount = inp.nextDouble();
		
		if (amount<0) {
			System.out.println("You entered an invalid amount!!");
			return;
		}

		if (amount == 0 || amount <= 1000) {
			vatRatio = 0.18;
			double vatAmount = amount * vatRatio;
			double total = amount + vatAmount;
			System.out.println(total);
		}

		if (amount > 1000) {
			vatRatio = 0.08;
			double vatAmount = amount * vatRatio;
			double total = amount + vatAmount;
			System.out.println(total);
		}
	}

}
