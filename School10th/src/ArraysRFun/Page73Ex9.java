package ArraysRFun;

public class Page73Ex9 {

	public static void main(String[] args) {
		int sum= 0, counter = 0, avg;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		avg = sum / arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == avg)
				counter++;
		}
		System.out.println(counter);

	}

}
