package FunctionsAndBefore;

import java.util.Scanner;

public class Bagrut6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sn, dr, amount;
		double sum = 0;
		char check;
		System.out.println("Enter the amount of snacks");
		sn = sc.nextInt();
		System.out.println("Enter the amount of drinks");
		dr = sc.nextInt();
		
		while (sn > 5 && dr > 5) {
			System.out.println("Enter a, b, or c and the amount you want");
			check = sc.next().charAt(0);
			amount = sc.nextInt();
			if (check == 'a') {
				sum += 2.50 * amount;
				sn -= amount;
			}
			else if (check == 'b') {
				sum += 4.50 * amount;
				dr -= amount;
			}
			else {
				sum += 6 * amount;
				sn -= amount;
				dr -= amount;
			}
		}
		System.out.println("The total money is: "+sum);
		System.out.println("The amount of drinks left is: "+dr);
		System.out.println("The amount of snacks lefis is: "+sn);
		sc.close();
	}

}
