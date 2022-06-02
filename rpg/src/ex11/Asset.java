package ex11;

// P455 練習問題11-2

public class Asset {
	String name;
	int price;

	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// メソッド
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
}
