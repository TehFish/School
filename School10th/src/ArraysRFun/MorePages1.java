package ArraysRFun;

import java.util.Scanner;

public class MorePages1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		int[] students = new int[40];
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter a num");
			students[i] = sc.nextInt();
		}
		for (int i = 0; i < students.length; i++) {
			avg += students[i];
		}
		avg /= 40;
		int[] aboveAverage = new int[20];
		for (int j = 0; j < aboveAverage.length; j++) {
			if (students[j] > avg) aboveAverage[j] = students[j];
		}
		sc.close(); 
	}

}
