package ArraysRFun;

public class AlotOfPages2 {

	public static void main(String[] args) {
		int[][] arr = new int[7][6];
		arr = AlotOfPages1.kelet(arr);
		System.out.println(check(arr, 5));
		checkAll(arr);
		checkX(arr, 3, 2);
		
	}
	
	public static boolean check(int[][] arr, int num) {
		for (int i = 1; i < arr[num].length; i++) 
			if (arr[num][i] < arr[num][i - 1]) return false;
		return true;
	}
	
	public static void checkAll(int[][] arr) {
		boolean idk = true;
		for (int i = 0; i < arr.length; i++)
			if (check(arr, i) == false) idk = false;
		System.out.println(idk);
	}
	
	public static boolean checkX(int[][] arr, int j, int x) {
		for (int i = 0; i < arr[j].length; i++) 
			if (arr[j][i] == x) return true;
		return false;
	}

}
