package FunctionsAndBefore;

import java.util.Scanner;

public class Bagrut8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0, sum = 0, check;
		for (int i = 0; i < 5000; i++) {
			System.out.println("Enter your amount of years and monthly buys sum");
			check = sum(sc.nextInt(), sc.nextInt());
			sum += check;
			if (check > 0)
				counter++;
		}
		System.out.println("The sum is: "+sum);
		System.out.println("The amount of people is: "+counter);
		sc.close();

	}
	public static int sum(int years, int buy) {
		//checks if a person is eligable to get gift cards and return the amount of money he deserves
		//if the person is not eligable return 0
		while (years >= 3 && buy >= 1200) {
			if (years < 8)
				return 50 * years;
			else if (years >= 8)
				return years * 100;
		}
		return 0;
	}

}
