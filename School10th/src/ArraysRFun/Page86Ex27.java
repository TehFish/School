package ArraysRFun;

import java.util.Random;

public class Page86Ex27 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] floors = new int[30];
		int[] office = new int[7];
		int floorSum = 0, minFloor = 350, minPlace = -1, maxOffice = 0, maxPlace = -1;
		for (int i = 0; i < floors.length; i++) {
			for (int j = 0; j < office.length; j++) {
				office[j] = rnd.nextInt(51);
				floorSum += office[j];
				if (office[j] > maxOffice) {
					maxOffice = office[j];
					maxPlace = i;
				}
			}
			floors[i] = floorSum;
			System.out.println("In floor "+i+" there are "+floors[i]+" workers");
			if (floors[i] < minFloor) {
				minFloor = floors[i];
				minPlace = i;
			}
			floorSum = 0;
		}
		System.out.println("The smallest floor is: "+minPlace+" the amount of workers there is "+minFloor);
		System.out.println("The biggest office is in floor: "+maxPlace+" The office number is: "+maxOffice);
	}

}
