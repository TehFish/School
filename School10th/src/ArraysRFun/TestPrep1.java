package ArraysRFun;

public class TestPrep1 {

	public static void main(String[] args) {
		if (taxes(6000, 56) > 8000) System.out.println("Very good");
		
	}
	/**
	 * 
	 * @param salary
	 * @param age
	 * @return neto salary of a person and -1 if it does not apply
	 */
	public static double taxes(double salary, int age) {
		if (salary > 5000 && age < 50) return salary * 0.7;
		else if (age > 60) return salary;
		else if (age > 30 && salary <= 5000) return salary * 0.9;
		else if (age <= 30 && salary <= 5000) return salary;
		return -1;
	}

}
