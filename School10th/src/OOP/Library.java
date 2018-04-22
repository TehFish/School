package OOP;

public class Library {
	private int numBooks;
	private Book[] books;

	public Library(Book[] books) {
		super();
		this.books = books;
		this.numBooks = this.books.length;
	}

	public int getNumBooks() {
		return numBooks;
	}
	public void setNumBooks(int numBooks) {
		this.numBooks = numBooks;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}

	public int bookAmountByAuthor(String author) {
		int counter = 0;
		for (int i = 0; i < this.books.length; i++)
			if (this.books[i].getAuthor().equals(author)) counter++;
		return counter;
	}

	public void updateAuthorName(String newName, String name) {
		for (int i = 0; i < this.books.length; i++)
			if (this.books[i].getAuthor().equals(name)) this.books[i].setAuthor(newName);
	}
}