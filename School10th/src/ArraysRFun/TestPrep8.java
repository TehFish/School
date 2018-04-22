package ArraysRFun;

public class TestPrep8 {

	public static void main(String[] args) {
		System.out.println(jAvaMAtIa(1, "abcdfg"));

	}
	
	/**
	 * 
	 * @param m
	 * @return the char at index m is at the last spot
	 */
	public static String jAvaMAtIa(int m, String s) {
		String s2 = s.substring(m);
		char c = s.charAt(m);
		s = s.substring(0, m);
		return s+""+s2+""+c;
	}

}
