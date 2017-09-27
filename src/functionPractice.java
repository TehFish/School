
public class functionPractice {

	public static void main(String[] args) {

	}
	public static int targil4(int num, int dig){
		// לוקח מספר שלם וספרה
		// מחזיר את כמות הפעמים שהספרה מופיעה במספר
		int counter = 0;
		while (num > 0){
			if (num % 10 == dig)
				counter++;
			num  /= 10;
		}
		return counter;
	}
	
	public static int targil5(int num1, int num2){
		//קולט שני מספרים
		// מחזיר מספר רנדומלי בין שני המספרים
		return (int)(num1 + Math.random() * num2);
	}
	
	public static int targil6(int num){
		// מקבל מספר
		// מחזיר את מספר הספרות הזוגיות במספר
		int counter = 0;
		while (num > 0){
			if (num % 10 % 2 == 0 )
				counter++;
			num  /= 10;
		}
		return counter;
	}
	
	public static int sumDigit(int num){
		// מקבל מספר
		// מחזיר את סכום הספרות שלו
		int total = 0;
			while (num > 0){
				total += num / 10;
				num /= 10;
			}
		return total;
	}
	public static boolean between(int num1, int num2, int num3){
		// מקבל שלוש מספרים
		// מחזיר אמת אם המספר הראשון הוא בין המספר השני והשלישי
		if (num1 > num2 && num1 < num3)
			return true;
		else if (num1 < num2 && num1 > num3)
			return true;
		
			return false;
	}
	
	
}
