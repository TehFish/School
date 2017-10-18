import java.util.Scanner;
public class While6 {

	public static void main(String[] args) {
		int counter = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		while (num >= 0){
			System.out.println("Enter a num");
			num = sc.nextInt();
			if (num >= 0)
				counter++;
		}
		System.out.println(counter);
	}
}
