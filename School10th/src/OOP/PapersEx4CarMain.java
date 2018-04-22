package OOP;

public class PapersEx4CarMain {

	public static void main(String[] args) {
		PapersEx4CarClass c1 = new PapersEx4CarClass();
		PapersEx4CarClass c2 = new PapersEx4CarClass(5, 18, 64);
		if (c1.getPrice() > c2.getPrice()) System.out.println(c1.toString());
		else System.out.println(c2.toString());

	}

}
