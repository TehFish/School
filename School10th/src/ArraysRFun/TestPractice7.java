package ArraysRFun;

import java.util.Scanner;

public class TestPractice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		boolean check = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			if (check(arr[j]) == false) check = false;
		}
		System.out.println(check);
		sc.close();
	}
	
	public static boolean check(int num) {
		int count = 0, zmani = num;
		while (zmani > 1) {
			zmani /= 10;
			count++;
		}
		while (num > 1) {
			if (num % 10 > count) return false;
			num /= 10;
		}
		return true;
	}
}
