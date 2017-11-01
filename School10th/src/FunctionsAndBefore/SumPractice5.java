package FunctionsAndBefore;
import java.util.Scanner;

public class SumPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next(), w;
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			w = s.substring(0, 3);
			s = s.substring(w.length());
			if (check(w)) counter++;
		}
		System.out.println(counter);
	}
	public static boolean check(String s) {
		//input a three letter string and check if it's first and last letters are equal and the middle is different
		if(s.charAt(0) == s.charAt(2) && s.charAt(0) != s.charAt(1)) return true;
		return false;
	}

}
