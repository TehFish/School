import java.util.Scanner;

public class SumPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 11;
		while (num > 10) {
			if (num < 100) System.out.println(num+", "+yes(num));
			else System.out.println(num+", "+no(num));
			
		}

	}
	public static int yes(int num){
		//returns the digit sum of a 2 digit number
		return (num % 10) + (num / 10);
	}
	
	public static int no(int num) {
		//returns the digit sum of the last two digits of a number
		int first = num % 10;
		num /= 10;
		return first + (num % 10);
	}

}
