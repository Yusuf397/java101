package java101examples;

import java.util.Scanner;

public class GroceryCashierProgram {

	public static void main(String[] args) {

		double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5;
		double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

		Scanner inp = new Scanner(System.in);
		System.out.print("How many kilos of pears do you want?: ");
		pearKg = inp.nextDouble();
		System.out.print("How many kilos of apples do you want?: ");
		appleKg = inp.nextDouble();
		System.out.print("How many kilos of tomatoes do you want?: ");
		tomatoKg = inp.nextDouble();
		System.out.print("How many kilos of bananas do you want?: ");
		bananaKg = inp.nextDouble();
		System.out.print("How many kilos of eggplants do you want?: ");
		eggplantKg = inp.nextDouble();

		double total = pear * pearKg + apple * appleKg + tomato * tomatoKg + banana * bananaKg + eggplant * eggplantKg;
		System.out.println(total);
	}

}
