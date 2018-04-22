package ArraysRFun;

public class Page72Ex3 {
	public static int[] alef(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			arr[i] = 0;
		return arr;
	}
	
	public static void hey(int[] arr) {
		for (int i = 0; i < arr.length; i += 2) 
			System.out.println(arr[i]);
		
	}
	
	public static void vav(int[] arr) {
		for (int i = 1; i < arr.length; i += 2)
			System.out.println(arr[i]);
	}
	
}
