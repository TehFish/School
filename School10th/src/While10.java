import java.util.Scanner;
public class While10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans = 'd';
		int yes = 0, no = 0, counter = 0, deny = 0;
		while (ans != 'f'){
			System.out.println("Enter your answer");
			ans = sc.next().charAt(0);
			if (ans == 'y'){
				yes++;
				counter++;
			}
			else if (ans == 'n'){
				no++;
				counter++;
			}
			else if (ans == 'd'){
				deny++;
				counter++;
			}		
		}
		System.out.println(yes+" people voted yes");
		System.out.println(no+" people voted no");
		if (yes * 100 / counter   >= 60)
			System.out.println("Success");
		else
			System.out.println("Nope");

	}

}
