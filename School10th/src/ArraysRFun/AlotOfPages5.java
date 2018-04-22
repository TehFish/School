 package ArraysRFun;

public class AlotOfPages5 {

	public static void main(String[] args) {
		
		int[][] arr = new int[25][3];
		arr = AlotOfPages1.kelet(arr);
		System.out.println(avg(arr, 4));
		

	}
	
	public static double avg(int[][] arr, int num) {
		double avg = 0;
		for (int i = 0; i < arr[num].length; i ++) 
			avg += arr[num][i];
		return avg / 3;
	}

}
