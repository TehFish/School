package ArraysRFun;
import java.util.Scanner;

public class Pages2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a num");
			arr[i] = sc.nextInt();
		}
		for (int j = 1; j <= 20; j += 2) {
			sum += arr[j];
		}
		System.out.println(sum / 10);
		sc.close();
	}

}
