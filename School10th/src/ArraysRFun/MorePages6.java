package ArraysRFun;

import java.util.Scanner;

public class MorePages6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg = 0;
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			avg += arr[i];
		}
		avg /= 50;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == avg) System.out.println("true");
			else System.out.println("false");
		}
		sc.close();
	}

}
