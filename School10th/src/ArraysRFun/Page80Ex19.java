package ArraysRFun;

public class Page80Ex19 {
	
	public static boolean isBalanced(int[] arr) {
		int sum = 0, highCount = 0, lowCount = 0; 
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) 
				lowCount++;
			else
				highCount++;
		}
		if (lowCount == highCount)
			return true;
		return false;
		
	}
}
