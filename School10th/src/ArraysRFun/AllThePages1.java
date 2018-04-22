package ArraysRFun;

import java.util.Random;

public class AllThePages1 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] age = new int[55];
		int[] amount = new int[5];
		int maxAge = 0, minAge = 70, common = 0;;
		for (int i = 0; i < amount.length; i++) {
			amount[i] = rnd.nextInt(91) + 10;
			for (int j = 0; j <amount[i]; j++) {
				age[rnd.nextInt(55)]++;
			}
		}
		for (int i = 54; i >= 0; i--) {
			if (age[i] > 0) minAge = i + 15;
			if (age[i] > common) {
				maxAge = i + 16;
				common = age[i];
			}
		}
		System.out.println("The youngest bich is: "+minAge);
		System.out.println("The most common age is: "+maxAge);
	}

}
