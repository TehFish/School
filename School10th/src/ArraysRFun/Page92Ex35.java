package ArraysRFun;

import java.util.Random;

public class Page92Ex35 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int n1 = rnd.nextInt(10) + 1, n2 = rnd.nextInt(10) + 1, counter = 0;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[Math.max(n1, n2)];
		for (int i = 0; i < Math.min(n1, n2); i++) {
			if (arr1[i] == arr2[i]) {
				arr3[counter] = arr1[i];
				counter++;
			}
		}
		for (int j = 0; j < arr3.length; j++) {
			System.out.println(arr3[j]);
		}
	}

}
