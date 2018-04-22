package ArraysRFun;

import java.util.Scanner;
public class Page80Ex21 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int amount;
		
		System.out.println("Enter the amount of kids in the class");
		amount = sc.nextInt();
		double[] arr = bet(amount);
		arr = alef(arr);
		gimel(arr);
	}
	/**
	 * 
	 * @param arr
	 * @return add 10% to all components
	 */
	public static double[] alef(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + arr[i] / 10 <= 100)
				arr[i] += arr[i] / 10;
			else
				arr[i] = 100;
		}
		return arr;
	}
	/**
	 * 
	 * @param num
	 * @return create a new array long as num
	 */
	public static double[] bet(int num) {
		double[] arr = new double[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter your grade");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	/**
	 * 
	 * @param arr
	 * print an array
	 */
	public static void gimel(double[] arr) {
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
	}

}
