package ArraysRFun;

import java.util.Random;

public class Pave92Ex34 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(100) + 1, counter1 = 0, counter2 = 0;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rnd.nextInt(21) - 10;
			if (arr1[i] % 2 == 0) {
				arr2[counter1] = arr1[i];
				counter1++;
			}
			else if (arr1[i] < 0){
				arr3[counter2] = arr1[i];
				counter2++;
			}
		}
	}
}
