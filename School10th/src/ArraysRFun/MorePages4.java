package ArraysRFun;

import java.util.Scanner;

public class MorePages4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[40];
		arr[0] = sc.nextInt();
		for (int i = 1; i < 40; i++) {
			arr[i] = arr[i - 1] * 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
