package OOP;

public class Book2 {
	private int code;
	private String author;
	private String name;
	private int publishYear;
	
	public Book2(int code, String author, String name, int publishYear) {
		super();
		this.code = code;
		this.author = author;
		this.name = name;
		this.publishYear = publishYear;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	

}
