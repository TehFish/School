package ArraysRFun;

import java.util.Scanner;

public class Page116Ex1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

	}
	
	public static int[][] alef(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter a num");
				arr[j][i] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public static void bet(int[][] arr) {
		for (int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.println(arr[j][i]);
		}
		System.out.println();
	}
	
	public static int[][] gimel(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++)
				arr[i][j] = 0;
		}
		return arr;
	}
	
	public static int[][] daled(int[][] arr){
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++) {
				arr[i][j] = counter;
				counter++;
			}
		}
		return arr;
	}

}
