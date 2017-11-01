package FunctionsAndBefore;
import java.util.Scanner;
public class Paper3 {

	public static void main(String[] args) {
		int count, orange, left;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of oranges in total");
		count = sc.nextInt();
		System.out.println("Enter the amount of oranges in each box");
		orange = sc.nextInt();
		left = count / orange;
		System.out.println("There are "+left+" orange boxes full");
		left = count % orange;
		System.out.println("There are "+left+" oranges left");
	}

}
