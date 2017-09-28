import java.util.Scanner;
public class Page48Ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 100; i++){
			System.out.println("Enter your id number");
			ffi(sc.nextInt());
		}

		sc.close();
	}

	public static int ffi(int num){
		int last, first;
		for (int i = 0; i < 2; i++){
			last =(int) (num / Math.pow(10, functionPractice.numDigit(num) - 1));
			first = num % 10;
			num *= 10;
			num += (last + first) % 10;
		}
		return num;
	}
}
