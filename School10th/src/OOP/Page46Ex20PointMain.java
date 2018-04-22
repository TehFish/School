package OOP;

public class Page46Ex20PointMain {

	public static void ex20(Point p1, Point p2) {
		if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) System.out.println("Same place");
		else if (p1.getY() == p2.getY()) System.out.println("Same row");
		else if (p1.getX() == p2.getX()) System.out.println("Same col");
		else System.out.println("Nothing in common ");
	}

}
