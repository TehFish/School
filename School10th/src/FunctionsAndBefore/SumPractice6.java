package FunctionsAndBefore;
import java.util.Scanner;

public class SumPractice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String a = sc.next(), b = sc.next(), c = "";
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'a')
				c = c+""+a.charAt(i);
		}
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) <= '9' && b.charAt(i) >= '1')
				c = b.charAt(i)+""+c;
		}
		System.out.println(c);
	}

}
