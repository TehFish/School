package ArraysRFun;

import java.util.Scanner;

public class Page74Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] arr = new int[n];
		int[] arr2 = new int[n / 3];
		int j = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i += 3) {
			if (arr[i] == 1)
				arr2[j] = arr[i + 1] + arr[i + 2];
			else if (arr[i] == 2)
				arr2[j] = arr[i + 1] - arr[i + 2];
			j++;
		}
		sc.close();
	}

}
