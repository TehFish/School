package FunctionsAndBefore;
import java.util.Scanner;

public class SumPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(check(s));
		System.out.println(num(s));
		
		sc.close();
	}
	public static boolean check(String s) {
		//checks if there is a series of the same letters
		for (int i = 0; i < s.length() - 1; i++){
			if (s.charAt(i) == s.charAt(i + 1)) return true;
		}
		return false;
	}
	
	public static int num(String s) {
		//returns the number of the digits of the longest series.
		int counter = 1, max = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				counter++;
			}
			else counter = 1;
			if (counter > max) max = counter;
		}
		return max;
	}

}
