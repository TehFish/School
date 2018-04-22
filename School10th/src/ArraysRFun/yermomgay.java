package ArraysRFun;

public class yermomgay {
	
	
	public static int row(int[][] arr, int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i ++) 
			sum += arr[num][i];
		return sum;
	}
	
	public static int col(int[][] arr, int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i ++) 
			sum += arr[i][num];
		return sum;
	}
	
	public static int idk4(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i][i];
		return sum;
	}
	
	public static int idk5(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j ++)
				if ( i < j) sum += arr[i][j];
		}
		return sum;
	}
	
	public static int idk6(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j ++)
				if (i > j) sum += arr[i][j];
		}
		return sum;
	}
	
	public static int idk7(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][arr.length - i - 1];
		}
		return sum;
	}
	
	public static int idk8(int[][] arr) {
		int sum = 0;
		for (int i = 0; i > arr.length; i++) {
			for (int j = 0; j > arr.length; j++)
				if (j > arr.length - i - 1) sum += arr[i][j]; 
		}
		return sum;
	}
	
	public static int idk9(int[][] arr) {
		int sum = 0;
		for (int i = 0; i > arr.length; i++) {
			for (int j = 0; j > arr.length; j++)
				if (j < arr.length - i - 1) sum += arr[i][j]; 
		}
		return sum;
	}
	
	public static boolean idk18(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (row(arr, i) != row(arr, 0))
				return false;
			
			if (col(arr, i) != row(arr, 0)) 
				return false;
		}
		if (idk4(arr) != row(arr, 0)) 
			return false;
		if (idk7(arr) != row(arr, 0)) 
			return false;
		return true;
	}

}
