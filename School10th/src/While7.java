import java.util.Scanner;
public class While7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0, maxGrade = 0, maxCounter = -1, minGrade = 100, minCounter = -1, counter = 0;
		while (grade >= 0){
			System.out.println("Enter a grade");
			grade = sc.nextInt();
			if (grade >= 0)
				counter++;
			if (grade > maxGrade){
				maxGrade = grade;
				maxCounter = counter;
			}
			else if (grade < minGrade){
				minGrade = grade;
				minCounter = counter;
			}
			if (grade >= 95)
				System.out.println("Success");
			else if (grade < 55)
				System.out.println("Fail");
		}
		System.out.println("The highest grade is: "+maxGrade+" the position is: "+maxCounter);
		System.out.println("The lowest grade is: "+minGrade+" the position is: "+minCounter);

	}

}
