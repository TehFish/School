package ArraysRFun;

import java.util.Random;

public class Page74Ex16 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arr = new int[20];
		int[] arr2 = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(101);
		}
		for (int i = 0; i < arr.length; i += 2) {
			if ((arr[i] + arr[i + 1]) % 3 == 0) {
				arr2[i] = arr[i];
				arr2[i + 1] = arr[i + 1];
				arr2[i + 2] = arr[i] + arr[i + 1]; 
			}
			else {
				arr2[i] = arr[i];
				arr2[i + 1] = arr[i + 1];
				arr2[i + 2] = 0;
			}
		}
	}

}
