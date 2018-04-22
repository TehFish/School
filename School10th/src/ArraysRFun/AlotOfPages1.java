package ArraysRFun;

public class AlotOfPages1 {
	
	public static int[][] kelet(int[][] arr){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter num");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}
}
