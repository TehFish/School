package ArraysRFun;

import java.util.Scanner;

public class Pages4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) arr[i] = 2;
			else arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} 
		sc.close();
	}

}
