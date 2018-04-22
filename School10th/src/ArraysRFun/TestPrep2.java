package ArraysRFun;

import java.util.Scanner;

public class TestPrep2 {
	
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.println("Enter the amount of people");
		amount = sc.nextInt();
		if (amount / 50 * 1200 < amount / 70 * 1500)
			System.out.println("Small boats");
		else
			System.out.println("Big boats");
		sc.close();
	}
}
