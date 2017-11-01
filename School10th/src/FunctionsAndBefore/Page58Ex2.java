package FunctionsAndBefore;
import java.util.Scanner;
public class Page58Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		for (int i = 0; i < 40; i++){
			System.out.println("Enter a word");
			s = sc.next();
			if (s.length() % 2  == 0) System.out.println(s);
		}
		sc.close();
	}

}
