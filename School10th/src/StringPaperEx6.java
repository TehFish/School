import java.util.Scanner;
public class StringPaperEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, num = -1, counterW = 0, counterM = 0, counterK = 0, counterS = 0;
		while (num != 0) {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if (num < 1000 && num > 99) {
				switch (hundreds(num)) {
					case 1: counterW++;
					total++;
					case 2: counterM++;
					total++;
					case 3: counterK++;
					total++;
					case 4: counterS++;
					total++;
				}
			}
			else {
				System.out.println("Incorrect Input");
				break;
			}
				
		}
		System.out.println("Womens division sales: "+counterW);
		System.out.println("Mens division sales: "+counterM);
		System.out.println("Kids division sales: "+counterK);
		System.out.println("Sports division sales: "+counterS);
		System.out.println("Total Sales: "+total);
		sc.close();
	}
	
	public static int hundreds(int num) {
		//input a num and get the hundred digit of it
		return num / 100;
	}

}
