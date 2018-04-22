package ArraysRFun;

import java.util.Scanner;

public class ArraySum2d {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int row(int r, int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr[r].length; i++) {
			sum += arr[r][i];
		}
		return sum;
	}
	
	public static int col(int c, int[][] arr) {
		int sum = 0;
		for (int i = 0; i <  arr.length; i++) {
			sum += arr[c][i];
		}
		return sum;
	}
	
	public static int round(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1) sum += row(i, arr);
			else if (i != arr[i].length) {
				sum += arr[i][0];
				sum += arr[i][arr[i].length - 1];
			}
		}
		return sum;
	}
}
