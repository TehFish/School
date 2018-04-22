package ArraysRFun;

import java.util.Random;
import java.util.Scanner;

public class Page75Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter num");
			arr[i] = sc.nextInt();
		}
		int num = rnd.nextInt(10) + 1;
		idk(arr, num);
		idk(arr, num + 1);
		sc.close();
	}
	public static void idk(int[] arr, int num) {
		if (num % 2 == 0) {
			for (int i = 0; i < arr.length; i += 2) 
				System.out.println(arr[i]);
		}
		else {
			for (int i = 1; i < arr.length; i += 2) 
				System.out.println(arr[i]);
		}
	}
	
	public static int[] why(int[] arr, int num) {
		int[] arr2 = new int[arr.length / 2];
		int counter = 0;
		if (num % 2 == 0) {
			for (int i = 0; i < arr.length; i += 2) {
				arr2[counter] = arr[i];
				counter++;
			}
		}
		else {
			for (int i = 1; i < arr.length; i += 2) {
				arr2[counter] = arr[i];
				counter++;
			}
		}
		return arr2;
	}

}
