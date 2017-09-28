import java.util.Scanner;
public class Page48Ex25 {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int sum = 0, counter = 0, grade = 0;
		while (true){
			System.out.println("Enter the grade and unit");
			System.out.println("or enter -1 to exit");
			grade = sc.nextInt();
			if (grade < 0) break;
			sum += average(grade, sc.nextInt());
			counter++;
		}
		System.out.println("The total average is: "+(sum / counter));
		
	}
	
	public static int average(int unit, int grade){
		if (unit == 4) grade += 10;
		else if (unit == 5) grade += 20;
		return grade;
	}

}
