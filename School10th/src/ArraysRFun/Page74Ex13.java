package ArraysRFun;

import java.util.Random;

public class Page74Ex13 {

	public static void main(String[] args) {
		Random rnd = new Random();
		boolean check = true;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(10);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] - arr[i + 1] < 0) check = false;
		}
		System.out.println(check);
	}

}
