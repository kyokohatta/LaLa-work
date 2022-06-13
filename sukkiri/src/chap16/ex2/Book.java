package chap16.ex2;

public class Book {
	// フィールド
	private String title;
	private String author;
	
	// コンストラクタ
	public Book() {}
	public Book(String title, String author) {
		setTitle(title);
		setAuthor(author);
	}
	
	
	// getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
