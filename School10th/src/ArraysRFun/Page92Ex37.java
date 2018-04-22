package ArraysRFun;

import java.util.Random;

public class Page92Ex37 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int n = rnd.nextInt(100) + 1, counter = 0;
		int[] flower1 = new int[n];
		int[] flower2 = new int[n];
		for (int i = 0; i < flower1.length; i++) {
			flower1[i] = rnd.nextInt(200) + 100;
		}
		for (int i = 0; i < flower1.length; i++) {
			if (flower1[i] / 100 == 2) {
				flower2[counter] = flower1[i];
				counter++;
				flower1[i] = 0;
			}
		}
		for (int i = 0; i < flower1.length; i++) {
			System.out.print(flower1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < flower2.length; i++) {
			System.out.print(flower2[i]+" ");
		} 
	}

}
