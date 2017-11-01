package FunctionsAndBefore;
import java.util.Scanner;

public class Paper1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int passangers = 0, total = 0, counter = 0, minP = 9999, minCounter = -1;
		while (passangers >= 0){
			System.out.println("Enter the amount of passangers");
			passangers = sc.nextInt();
			total += passangers;
			counter++;
			if (passangers < minP){
				minP = passangers;
				minCounter = counter;
			}
		}
		System.out.println("The avarage amount of passangers per flight is: "+(total / counter));
		System.out.println("The total amount of passangers is :"+total);
		System.out.println("The smallest amount of passangers were on flight #"+minCounter);
		
		
		
		

	}

}
