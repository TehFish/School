package ArraysRFun;

import java.util.Scanner;

public class Pages5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a num");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) * 2 == arr[i]) check = true;
			else {
				check = false;
				break;
			}
		}
		System.out.println(check);
		sc.close();
	}

}
