package ArraysRFun;

public class AlotOfPages4 {

	public static void main(String[] args) {
		
		int[][] arr = new int[12][12];
		for (int i = 1; i < arr.length - 1; i ++) {
			for (int j = 1; j < arr[j].length - 1; j++) {
				arr[i][j] = i * j;
			}
		}
		
		for (int i = 1; i < arr.length - 1; i ++) {
			for (int j = 1; j < arr[j].length - 1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
