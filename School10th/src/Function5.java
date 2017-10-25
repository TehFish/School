import java.util.Scanner;
public class Function5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while (num1 != -999 && num2 != -999){
			System.out.println("Enter the 2 nums");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			for (int i = 0; i < 5; i++)
				System.out.println(functionPractice.targil5(num1, num2)); 
		}
		sc.close();
	}

}
