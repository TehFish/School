package FunctionsAndBefore;
import java.util.Scanner;
public class Function6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, maxNum = 0, maxDig = 0;
		while (num != -1){
			System.out.println("Enter a number");
			num = sc.nextInt();
			if (functionPractice.targil6(num) > maxDig)
				maxNum = num;
		}
		System.out.println(maxNum);
		sc.close();
	}
}
