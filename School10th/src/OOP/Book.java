package OOP;

public class Book {
	private String name;
	private int year;
	private String author;
	private boolean firstPublished;
	
	public Book(String name, int year,String author, boolean firstPublished) {
		this.name = name;
		this.year = year;
		this.author = author;
		this.firstPublished = firstPublished;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isFirstPublished() {
		return firstPublished;
	}

	public void setFirstPublished(boolean firstPublished) {
		this.firstPublished = firstPublished;
	}
}
