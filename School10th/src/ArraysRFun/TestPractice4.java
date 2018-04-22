package ArraysRFun;

import java.util.Scanner;

public class TestPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int counter = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'Y' && str.charAt(i + 1) == ' ') {
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
	}

}
