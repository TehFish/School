package ArraysRFun;

import java.util.Random;

public class AllThePages2 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] arr = new int[20];
		int max = 0;
		for (int i = 0; i < 15; i++) {
			arr[rnd.nextInt(20)]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) System.out.println("contestant "+i);
		}
	}

}
