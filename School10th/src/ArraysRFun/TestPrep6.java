package ArraysRFun;

import java.util.Scanner;

public class TestPrep6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choose1, choose2, rounds, counter1 = 0, counter2 = 0;
		System.out.println("Enter the amount of rounds");
		rounds = sc.nextInt();
		for (int i = 0; i < rounds; i++) {
			System.out.println("First player choose 1, 2 or 3, 1 is rock, 2 is siccors, 3 is paper");
			choose1 = sc.nextInt();
			System.out.println("Second player choose 1, 2 or 3, 1 is rock, 2 is siccors, 3 is paper");
			choose2 = sc.nextInt();
			if (choose1 == 1 && choose2 == 3) counter2++;
			else if (choose2 == 1 && choose1 == 3) counter1++;
			else if (choose1 == 2 && choose2 == 1) counter2++;
			else if (choose2 == 2 && choose1 == 1) counter1++;
			else if (choose1 == 3 && choose2 == 2) counter2++;
			else if (choose2 == 3 && choose1 == 2) counter1++;
		}
		if (counter1 > counter2) System.out.println("Player 1 won");
		else System.out.println("Player 2 won");
		sc.close();

	}

}
