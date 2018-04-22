package ArraysRFun;

public class TestPrep7 {

	public static void main(String[] args) {
		int clombe = 0, counter = 0;
		while (clombe < 13) {
			clombe += 3;
			if (clombe < 13) {
				System.out.println(counter);
				break;
			}
			else {
				clombe -= 2;
				counter++;
			}
		}

	}

}
