import java.util.Scanner;
public class BooleanPaper18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, check = 0, counter = 0;
		while (check != 1){
			System.out.println("Enter 2 numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (functionPractice.zugi(num1 + num2) && functionPractice.divideBy7(num1 + num2))
				counter++;
		}
		System.out.println(counter);
		sc.close();
	}

}
