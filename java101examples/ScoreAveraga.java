package java101examples;

import java.util.Scanner;

public class ScoreAveraga {

	public static void main(String[] args) {
		
		int math, physics, turkish,chemical,history,music;
        
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Math score: ");
		math=inp.nextInt();
		System.out.print("Physics score: ");
		physics=inp.nextInt();
		System.out.print("Turkish score: ");
		turkish=inp.nextInt();
		System.out.print("Chemical score: ");
		chemical=inp.nextInt();
		System.out.print("History score: ");
		history=inp.nextInt();
		System.out.print("Music score: ");
		music=inp.nextInt();
		
		int sum=math+physics+turkish+chemical+history+music;
		double total= sum/6;
		System.out.println(total);
		String result= total>50 ? "pass":"fail";
		System.out.println(result);
		
		
	}

}
