package FunctionsAndBefore;
import java.util.Scanner;

public class SumPractice1 {

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, counter = 0, newNum;
		System.out.println("Enter a num");
		num = sc.nextInt();
		if (num != 0) counter++;
		for (int i = 0; i < 100; i++) {
			System.out.println("Enter a num");
			newNum = sc.nextInt();
			if (newNum != 0 && (num < 0 && newNum > 0 || num > 0 && newNum < 0)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
