package OOP;

import java.util.Scanner;

public class Page17Ex3_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stuff for both accounts");
		Page17Ex3_A b1 = new Page17Ex3_A(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Page17Ex3_B b2 = new Page17Ex3_B(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		if (!b1.drawFunds(b2.getMonthlyInsert())) System.out.println("in danger of closing");
		sc.close();
	}

}
