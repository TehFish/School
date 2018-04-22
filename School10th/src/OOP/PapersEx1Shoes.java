package OOP;

public class PapersEx1Shoes {
	private String color;
	private double price;
	private int size;
	private String code;

	public PapersEx1Shoes(String color, double price, int size, String code) {
		super();
		this.color = color;
		this.price = price;
		this.size = size;
		this.code = code;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public static boolean compareAvgPrice(PapersEx1Shoes[] S, int m1, int f1) {
		double mAvg = 0, fAvg = 0, mCounter = 0, fCounter = 0;
		for (int i = 0; i < S.length; i++) {
			if ((S[i].getCode().charAt(0) == 'M' && S[i].getSize() == m1) || (S[i].getCode().charAt(0) == 'U' && S[i].getSize() == m1)) {
				mAvg += S[i].getPrice();
				mCounter++;
			}
			else if ((S[i].getCode().charAt(0) == 'F' && S[i].getSize() == f1) || (S[i].getCode().charAt(0) == 'U' && S[i].getSize() == m1)) {
				fAvg += S[i].getPrice(); 
				fCounter++;
			}
		}
		mAvg /= mCounter;
		fAvg /= fCounter;
		return fAvg > mAvg;
	}
}
