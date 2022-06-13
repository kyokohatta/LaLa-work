package chap16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("「ゲド戦記」", "アーシュラ・K・ル=グウィン");
		Book book2 = new Book("「風の谷のナウシカ」", "宮崎駿");
		Book book3 = new Book("「魔女の宅急便」", "角野栄子");

		// リストを作成
		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		for (Book b : bookList) {
			System.out.println("タイトル：" + b.getTitle() + "\n著者：" + b.getAuthor() + "\n");
		}

		// コンストラクタを使わなかったら、、、いちいち↓する必要がある
		Book book = new Book();
		book.setTitle("「ゲド戦記」");
		book.setAuthor("アーシュラ・K・ル=グウィン");
	}

}
