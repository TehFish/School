package ArraysRFun;

public class ArrayCountWierdHomework {

	public static boolean check(int[][] arr) {
		boolean col = true, row = true;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[j].length; j++) 
				if (arr[i][j] <= arr[i][j - 1]) row = false;
		}
		for (int i = 1; i < arr[i].length; i++) {
			for (int j = 1; j < arr.length; j++) 
				if (arr[j][i] <= arr[j - 1][i]) col = false;	
		}
		return row && col;
	}
}
