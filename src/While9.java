import java.util.Scanner;
public class While9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10, maxNum = 10;
		while (num > 9 && num < 100){
			System.out.println("Enter a number");
			num = sc.nextInt();
			if (num % 10 != num / 10){
				if (num > maxNum)
					maxNum = num;
			}
			
		}
		System.out.println(maxNum);

	}

}
