package ArraysRFun;

public class TestPractice6 {
	
	public static int day(int day, int n) {
		if (n < 7) return day + n - 7;
		else if (n > 7) return (day + (n % 7)) - 7;
		else return day;
	}
}
