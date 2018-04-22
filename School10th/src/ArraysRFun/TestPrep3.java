package ArraysRFun;

import java.util.Scanner;

public class TestPrep3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message");
		String s = sc.nextLine();
		System.out.println(s);
		System.out.println(encrypt(s));
		System.out.println(decrypt(s));
		
		sc.close();
	}
	/**
	 * prints the encrypted message
	 * @param s
	 */
	public static String encrypt(String s) {
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') s2 = s2+"$";
			else s2 = s2+""+s.charAt(i);
		}
		return s2;
	}
	
	/**
	 * 
	 * @param s
	 * @return decrypted message
	 */
	public static String decrypt(String s) {
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '$') s2 = s2+"a";
			else s2 = s2+""+s.charAt(i);
		}
		return s2;
	}

}
