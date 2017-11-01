package FunctionsAndBefore;

import java.util.Scanner;

public class Bagrut9 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int counter = 0, num;
		for (int i = 0; i < 980; i++) {
			System.out.println("Enter a digit 1-8");
			num = enterNums(sc.nextInt());
			System.out.println(num);
			if (num / 10 == 9)
				counter++;
		}
		System.out.println("The amount of people that went to voicemail is: "+counter);

	}

	public static int fullNum(int num, int digit) {
		//adds the last digit pressed to a num
		num *= 10;
		return num + digit;
	}

	public static int enterNums(int num) {
		//input numbers and add them into an int as long as they are not 9 or 0
		int full = num;
		if (full == 0 || full == 9)
			return full;

		while (true) {
			System.out.println("Enter a digit");
			num = sc.nextInt();
			if (num != 0 && num != 9)
				full = fullNum(full, num);
			else
				return fullNum(full, num);
		}
	}
}
