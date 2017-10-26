import java.util.Scanner;

public class SumPractice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

	}
	public static void up(int num) {
		int sin, ten;
		sin = num % 10;
		ten = num / 10;

		if (sin > ten) {
			for (int i = ten; i < sin; i++) {
				System.out.print(i+", ");
			}
		}
		else {
			for (int i = sin; i < ten; i++) {
				System.out.print(i+", ");
			}
		}

	}

}
