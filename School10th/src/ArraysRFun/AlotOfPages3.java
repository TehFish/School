package ArraysRFun;

public class AlotOfPages3 {

	public static void main(String[] args) {
		
		int[][] arr = new int[7][5];
		for (int i = 0; i < arr.length; i ++) {
			for (int j = 0; j < arr[j].length; j++) {
				arr[i][j] = i * 10 + j;
			}
		}
	}

}
