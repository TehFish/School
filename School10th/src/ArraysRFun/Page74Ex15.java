package ArraysRFun;

import java.util.Scanner;

public class Page74Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		char[] arr = new char[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		for (char c = 'a'; c <= 'Z'; c++) {
			for (int i = 0; i < arr.length; i++) {
				if (c == arr[i]) check = true; 
			}
			if (check == false) System.out.println(c);
		}
		sc.close();
	}

}
