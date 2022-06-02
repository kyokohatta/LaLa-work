package ex11;

public class Main_ex11 {

	public static void main(String[] args) {
		Book book = new Book("ゲド戦記", 720, "みどり", "978-4");
		
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		Computer com = new Computer("MacbookPro", 140000, "silver", "apple");
		System.out.println(com.getName());
		System.out.println(com.getMakerName());
	}

}
