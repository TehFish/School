package OOP;

public class PapersEx3RecMain {

	public static void main(String[] args) {
		
		PapersEx3RecClass r1 = new PapersEx3RecClass(5, 3);
		PapersEx3RecClass r2 = new PapersEx3RecClass(8, 10);
		PapersEx3RecClass r3 = new PapersEx3RecClass(12, 3);
		
		if (r1.area() < r2.area() && r1.area() < r3.area()) {
			System.out.println(r1.area());
			System.out.println(r2.getLength()+" "+r2.getWidth());
			System.out.println(r3.getLength()+" "+r3.getWidth());
		}
		
		else if (r2.perimeter() > r3.perimeter()) System.out.println(r2.getWidth());
	}

}
