package ArraysRFun;

import java.util.Scanner;

public class TestPractice3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] vaycay = new double[12];
		for (int i = 0; i < vaycay.length; i++) {
			vaycay[i] = avg();
		}
		System.out.println(vacationCheck(vaycay));

	}
	
	public static double avg() {
		int score = 0, counter = 0;
		double avg = 0;
		while (score >= 0) {
			System.out.println("Enter a score");
			score = sc.nextInt();
			avg += score;
			counter++;
		}
		if (counter > 100) {
			avg /= counter;
			return avg;
		}
		return 0;
	}
	
	public static boolean vacationCheck(double[] arr) {
		for (int i = 0; i < 11; i++) {
			if (arr[i] > 8 && arr[i + 1] > 8)
				return true;
		}
		return false;
	}
}
