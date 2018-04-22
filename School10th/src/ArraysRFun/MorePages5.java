package ArraysRFun;

import java.util.Random;

public class MorePages5 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int min = 201, siduri = 150;
		int[] arr = new int[150];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(151) + 50;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				siduri = i;
			}
		}
		System.out.println(min+", "+siduri);
	}

}
