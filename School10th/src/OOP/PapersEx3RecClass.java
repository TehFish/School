package OOP;

public class PapersEx3RecClass {
	
	private int width;
	private int length;
	
	public PapersEx3RecClass(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public PapersEx3RecClass(int length) {
		this.width = 2;
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int area() {
		return this.length * this.width;
	}
	
	public int perimeter() {
		return this.length * 2 + this.width * 2;
	}
	

}
