package ArraysRFun;

import java.util.Scanner;

public class Pages3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a num");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < 20; j++) {
			if (arr[j] % 4 == 0) counter++;
		}
		System.out.println(counter);
		sc.close();

	}

}
