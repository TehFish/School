package FunctionsAndBefore;
import java.util.Scanner;
public class While8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, total2 = 0, total3 = 0;
		while (num >= 0){
			System.out.println("Enter a num");
			num = sc.nextInt();
			if (num % 2 == 0)
				total2 += num;
			if (num % 3 == 0)
				total3 += num;
		}
		System.out.println(total2 * total3);

	}

}
