import java.util.*;
public class functionPractice {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

	}

	public static int numDigit(int num){
		//לוקחת מספר ומחזירה את מספר הספרות שלו
		int counter = 0;
		while (num > 0){
			counter++;
			num /= 10;
		}
		return counter;
	}
	
	public static int targil4(int num, int dig) {
		// לוקח מספר שלם וספרה
		// מחזיר את כמות הפעמים שהספרה מופיעה במספר
		int counter = 0;
		while (num > 0) {
			if (num % 10 == dig)
				counter++;
			num /= 10;
		}
		return counter;
	}

	public static int targil5(int num1, int num2) {
		// קולט שני מספרים
		// מחזיר מספר רנדומלי בין שני המספרים
		return (int) (num1 + Math.random() * num2);
	}

	public static int targil6(int num) {
		// מקבל מספר
		// מחזיר את מספר הספרות הזוגיות במספר
		int counter = 0;
		while (num > 0) {
			if (num % 10 % 2 == 0)
				counter++;
			num /= 10;
		}
		return counter;
	}

	public static int sumDigit(int num) {
		// מקבל מספר
		// מחזיר את סכום הספרות שלו
		int total = 0;
		while (num > 0) {
			total += num / 10;
			num /= 10;
		}
		return total;
	}

	public static boolean between(int num1, int num2, int num3) {
		// מקבל שלוש מספרים
		// מחזיר אמת אם המספר הראשון הוא בין המספר השני והשלישי
		if (num1 > num2 && num1 < num3)
			return true;
		else if (num1 < num2 && num1 > num3)
			return true;

		return false;
	}
	
	public static boolean zugi(int num){
		//מקבלת מספר ומחזירה אמת אם הוא זוגי
		return num % 2 == 0;
	}
	
	public static boolean divideBy7(int num){
		//מקבלת מספר ומחזירה אמת אם הוא מתחלק ב7
		return num % 7 == 0;
	}
	
	public static int oppositeNum(int num){
		//מקבלת מספר 4 ספרתי ומחזירה את המספר עם סדר הספרות ההפוך לו
		return (num / 1000) + (num / 100 % 10) * 10 + (num / 10 % 10) * 100 + (num % 10) * 1000;
	}
	
	public static int Digit4(){
		//מחזירה מספר 4 ספרתי שהמשתמש מכניס
		System.out.println("Enter a 4 digit number");
		return sc.nextInt();
	}
	
	public static void following(int num){
		//מקבלת מספר, אם הוא זוגי, מדפיסה את 10 המספרים העוקבים לו
		// אם המספר לא זוגי, מדפיס את 10 המספרים הקודמים לו
		if (num % 2 == 0){
			for (int i = 0; i < 10; i++){
				System.out.print(++num);
				num++;
			}
		}
		else
			for (int j = 0; j < 10; j++){
				System.out.print(--num);
				num--;
			}
	}
	
	public static int tenths(int num){
		//מקבלת מספר אם ומחזירה את ערך העשרת של המספר
		if (num <= 10)
			return 1;
		else if (num == 100)
			return 9;
		
			return num / 10;
	}
	
	

}
