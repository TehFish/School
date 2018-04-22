package OOP;

public class BagrutPractice1 {

	public static void main(String[] args) {}
	
	public static int getSmallestIndex(int[] arr) {
		int minNum = arr[0], minIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
