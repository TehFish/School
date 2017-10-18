import java.util.Scanner;
public class Paper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tripleD, singleD;
		System.out.println("Enter a three digit number then a single digit number");
		tripleD = sc.nextInt();
		singleD = sc.nextInt();
		
		if (singleD == tripleD % 10|| singleD == tripleD % 100 / 10 || singleD == tripleD / 100 )
			System.out.println(singleD);
		else
			System.out.println("No Match");

	}

}
