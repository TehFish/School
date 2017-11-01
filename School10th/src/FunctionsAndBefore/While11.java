package FunctionsAndBefore;
import java.util.Scanner;
public class While11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = 0, counter = 0;
		double pay = 0, total = 0;
		while (hours != -999 && pay != -999){
			System.out.println("Enter the amount of hours you worked");
			hours = sc.nextInt();
			System.out.println("Enter your hourly pay");
			pay = sc.nextDouble();
			if (hours != -999 && pay != -999)
				total += hours * pay;
			else if (hours >= 150)
				total += 250;
			counter++;
		}
		System.out.println("The total is: "+total);
		System.out.println("The avarage pay is: "+(total / counter));

	}

}
