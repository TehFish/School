package FunctionsAndBefore;
import java.util.*;
public class functionPractice {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static int numDigit(int num){
		//input a number and output the amount of digits in the number
		int counter = 0;
		while (num > 0){
			counter++;
			num /= 10;
		}
		return counter;
	}

	public static int targil4(int num, int dig) {
		//???
		int counter = 0;
		while (num > 0) {
			if (num % 10 == dig)
				counter++;
			num /= 10;
		}
		return counter;
	}

	public static int targil5(int num1, int num2) {
		// ׳§׳•׳�׳˜ ׳©׳ ׳™ ׳�׳¡׳₪׳¨׳™׳�
		// ׳�׳—׳–׳™׳¨ ׳�׳¡׳₪׳¨ ׳¨׳ ׳“׳•׳�׳�׳™ ׳‘׳™׳� ׳©׳ ׳™ ׳”׳�׳¡׳₪׳¨׳™׳�
		return (int) (num1 + Math.random() * num2);
	}

	public static int targil6(int num) {
		// ׳�׳§׳‘׳� ׳�׳¡׳₪׳¨
		// ׳�׳—׳–׳™׳¨ ׳�׳× ׳�׳¡׳₪׳¨ ׳”׳¡׳₪׳¨׳•׳× ׳”׳–׳•׳’׳™׳•׳× ׳‘׳�׳¡׳₪׳¨
		int counter = 0;
		while (num > 0) {
			if (num % 10 % 2 == 0)
				counter++;
			num /= 10;
		}
		return counter;
	}

	public static int sumDigit(int num) {
		// ׳�׳§׳‘׳� ׳�׳¡׳₪׳¨
		// ׳�׳—׳–׳™׳¨ ׳�׳× ׳¡׳›׳•׳� ׳”׳¡׳₪׳¨׳•׳× ׳©׳�׳•
		int total = 0;
		while (num > 0) {
			total += num / 10;
			num /= 10;
		}
		return total;
	}

	public static boolean between(int num1, int num2, int num3) {
		// ׳�׳§׳‘׳� ׳©׳�׳•׳© ׳�׳¡׳₪׳¨׳™׳�
		// ׳�׳—׳–׳™׳¨ ׳�׳�׳× ׳�׳� ׳”׳�׳¡׳₪׳¨ ׳”׳¨׳�׳©׳•׳� ׳”׳•׳� ׳‘׳™׳� ׳”׳�׳¡׳₪׳¨ ׳”׳©׳ ׳™ ׳•׳”׳©׳�׳™׳©׳™
		if (num1 > num2 && num1 < num3)
			return true;
		else if (num1 < num2 && num1 > num3)
			return true;

		return false;
	}

	public static boolean zugi(int num){
		//׳�׳§׳‘׳�׳× ׳�׳¡׳₪׳¨ ׳•׳�׳—׳–׳™׳¨׳” ׳�׳�׳× ׳�׳� ׳”׳•׳� ׳–׳•׳’׳™
		return num % 2 == 0;
	}

	public static boolean divideBy7(int num){
		//׳�׳§׳‘׳�׳× ׳�׳¡׳₪׳¨ ׳•׳�׳—׳–׳™׳¨׳” ׳�׳�׳× ׳�׳� ׳”׳•׳� ׳�׳×׳—׳�׳§ ׳‘7
		return num % 7 == 0;
	}

	public static int oppositeNum(int num){
		//׳�׳§׳‘׳�׳× ׳�׳¡׳₪׳¨ 4 ׳¡׳₪׳¨׳×׳™ ׳•׳�׳—׳–׳™׳¨׳” ׳�׳× ׳”׳�׳¡׳₪׳¨ ׳¢׳� ׳¡׳“׳¨ ׳”׳¡׳₪׳¨׳•׳× ׳”׳”׳₪׳•׳� ׳�׳•
		return (num / 1000) + (num / 100 % 10) * 10 + (num / 10 % 10) * 100 + (num % 10) * 1000;
	}

	public static int Digit4(){
		//׳�׳—׳–׳™׳¨׳” ׳�׳¡׳₪׳¨ 4 ׳¡׳₪׳¨׳×׳™ ׳©׳”׳�׳©׳×׳�׳© ׳�׳›׳ ׳™׳¡
		System.out.println("Enter a 4 digit number");
		return sc.nextInt();
	}

	public static void following(int num){
		//׳�׳§׳‘׳�׳× ׳�׳¡׳₪׳¨, ׳�׳� ׳”׳•׳� ׳–׳•׳’׳™, ׳�׳“׳₪׳™׳¡׳” ׳�׳× 10 ׳”׳�׳¡׳₪׳¨׳™׳� ׳”׳¢׳•׳§׳‘׳™׳� ׳�׳•
		// ׳�׳� ׳”׳�׳¡׳₪׳¨ ׳�׳� ׳–׳•׳’׳™, ׳�׳“׳₪׳™׳¡ ׳�׳× 10 ׳”׳�׳¡׳₪׳¨׳™׳� ׳”׳§׳•׳“׳�׳™׳� ׳�׳•
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
		//׳�׳§׳‘׳�׳× ׳�׳¡׳₪׳¨ ׳�׳� ׳•׳�׳—׳–׳™׳¨׳” ׳�׳× ׳¢׳¨׳� ׳”׳¢׳©׳¨׳× ׳©׳� ׳”׳�׳¡׳₪׳¨
		if (num <= 10)
			return 1;
		else if (num == 100)
			return 9;

		return num / 10;
	}

	public static boolean firstAndLast(String s){
		//׳�׳§׳‘׳�׳× ׳�׳™׳�׳” ׳•׳�׳—׳–׳™׳¨׳” ׳�׳�׳× ׳�׳� ׳”׳×׳• ׳”׳¨׳�׳©׳•׳� ׳•׳”׳�׳—׳¨׳•׳� ׳©׳•׳•׳™׳� ׳•׳©׳§׳¨ ׳�׳—׳¨׳×
		return s.charAt(0) == s.charAt(s.length() - 1);
	}

	public static int charCount(String s, char c) {
		//input a string and a char, output the amount of times the char is in the string
		int counter = 0;
		System.out.println("Enter the string");
		s = sc.nextLine();
		System.out.println("Enter the char");
		c = sc.next().charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) counter++;		
		}
		return counter;
	}

	public static String rasheiTeivot() {
		//input two words and make a rashei teivot for them
		System.out.println("Enter the two words");
		String s1 = sc.next(), s2 = sc.next();
		char c1 = s1.charAt(0), c2 = s2.charAt(0);
		String s3 = "ab";
		s3.replace('a', c1);
		s3.replace('b', c2);
				
		return s1+", "+s2+", "+s3;
	}

	public static void StringPaperEx4(int min, int max) {
		//input two numbers output the numbers that apply to the condition
		if (min > 99 && min < 1000 && max > 100 && max < 1000) {
			int tens, hundreds, singles;
			for (int i = min; i < max; i++) {
				singles = i % 10;
				tens = i / 10 % 10;
				hundreds = i / 100;
				if (tens + hundreds == Math.pow(singles, 2)) System.out.println(i);
			}
		}
	}
	
	public static int longWord(String w) {
		//...
		String s;
		int max = 0;
		
		for (int i = 0; i < w.length(); i++) {
			if (w.charAt(i) == '.') {
				s = w.substring(0, i);
				w = w.substring(w.length());
				i = 0;
				if (s.length() > max) max = s.length();
			}
		}
		return max;
	}
	
	public static int firstCh(String s, char c) {
		//Input a char and a string, if that char is in the string output the index of its first occurrence else output -1
		return s.indexOf(c);
	}
	
	public static int lastCh(String s, char c) {
		//Input a char and a string, if that char is in the string output the index of its last occurrence else output -1
		for (int i = s.length(); i > 0; i--) {
			if (s.charAt(i) == c) return i;
		}
		return -1;
	}
	
	public static double sumPractice7(String s) {
		String[] s2 = s.split(" ", 20);
		return s2.length * 0.1;
	}

}
