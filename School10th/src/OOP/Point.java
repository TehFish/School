package OOP;
import java.util.Random;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x= "+ this.x +" y= "+ this.y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
		Random rnd = new Random();
		Point p1 = new Point(rnd.nextInt(21) - 10, rnd.nextInt(21) - 10);
		Point p2 = new Point(rnd.nextInt(21) - 10, rnd.nextInt(21) - 10);
		Point p3 = new Point((p1.getX() + p2.getX()) / 2,(p1.getY() + p2.getY()) / 2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
