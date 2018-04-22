package ArraysRFun;

import java.util.Scanner;

public class TestPrep4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int max = 0, days, amount;
		for (int i = 0; i < 12; i++) {
			System.out.println("Enter the number of rainy days");
			days = sc.nextInt();
			System.out.println("Enter the amount of rain");
			amount = sc.nextInt();
			System.out.println("The amount of rainy days this month is:"+days);
			System.out.println("The average amount of rain this month is: "+amount);
			if (amount > max) max = amount;
		}
		System.out.println("The most amount of raint this year is"+max);

	}

	/**
	 * 
	 * @param d- amount of numbers
	 * @return sum of inputed numbers
	 */
	public static double avg (int d) {
		int sum = 0;
		for (int i = 0; i < d; i++) {
			System.out.println("Enter a number");
			sum += sc.nextInt();
		}
		return sum / d;
	}
}
