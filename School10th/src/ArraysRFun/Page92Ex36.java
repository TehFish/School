package ArraysRFun;

import java.util.Scanner;

public class Page92Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] last = new char[5];
		char[] bLast = new char[5];
		char[] arr = new char[16];
		int counter = 0;
		for (int i = 0; i < bLast.length; i++) {
			last[i] = sc.next().charAt(0);
			bLast[i] = sc.next().charAt(0);
		}
		for (char j = 'a'; j < 'z'; j++) {
			for (int k = 0; k < 5; k++) {
				if (last[k] != j && bLast[k] != j) {
					arr[counter] = j;
					counter++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	sc.close();	
	}

}
