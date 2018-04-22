package ArraysRFun;

import java.util.Scanner;

public class Pages6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min;
		int [] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a num");
			arr[i] = sc.nextInt();
		}
		min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) min = arr[i];
		}
		System.out.println(min);
		sc.close();

	}

}
