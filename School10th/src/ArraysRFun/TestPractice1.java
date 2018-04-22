package ArraysRFun;

import java.util.Scanner;

public class TestPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 99, jump = 0, jacuzz = 0, sauna = 0;
		int[] arr = new int[3];
		while (age >= 12) {
			System.out.println("Enter your age");
			age = sc.nextInt();
			arr = checkByAge(age);
			jump += arr[0];
			jacuzz += arr[1];
			sauna += arr[2];
		}
		System.out.println(jump+" "+jacuzz+" "+sauna);
		sc.close();

	}
	
	public static int[] checkByAge(int age) {
		int[] arr = new int[3];
		if (age >= 18) {
			arr[0] = 1;
			arr[1] = 1;
			arr[2] = 1;
		}
		else if (age >= 16) {
			arr[0] = 1;
			arr[2] = 1;
		}
		else if (age >= 12) {
			arr[0] = 1;
		}
		return arr;
	}

}
