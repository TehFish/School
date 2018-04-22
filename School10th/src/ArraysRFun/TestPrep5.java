package ArraysRFun;

import java.util.Scanner;

public class TestPrep5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the report");
		String report = sc.next();
		boolean check = true;
		char last, next;
		for (int i = 0; i < report.length() - 1; i++) {
			last = report.charAt(i);
			next = report.charAt(i + 1);
			if (last == 'R' && next != 'B') check = false;
			else if (last == 'B' && next != 'G') check = false;
			else if (last == 'G' && next != 'R') check = false;
		}
		System.out.println(check);
		sc.close();

	}

}
