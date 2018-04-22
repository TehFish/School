package ArraysRFun;

import java.util.Random;

public class TestPractice5 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arr = new int[36];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(8) + 5;
			if (arr[i] == 8) counter++;
		}
		System.out.println(counter);

	}

}
