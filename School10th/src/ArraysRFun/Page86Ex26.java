package ArraysRFun;

import java.util.Random;

public class Page86Ex26 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] arr = new int[10];
		int num;
		for (int i = 0; i < 1000; i++) {
			num = rnd.nextInt(10) + 1;
			arr[num - 1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1)+": "+arr[i]+"  ");
		}

	}

}
