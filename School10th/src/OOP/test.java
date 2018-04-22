package OOP;

public class test {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for (int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++)
				System.out.print(arr[i][k]);
			System.out.println();
		}

	}

}
