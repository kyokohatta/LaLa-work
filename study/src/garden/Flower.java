package garden;

public class Flower {
	// フィールド
	public String name;
	
	// コンストラクタ
	public Flower() {
		this.name = "花";
	}
	public Flower(String name) {
		this.name = name;
	}
	
	// メソッド
	public void bloom() {
		System.out.println(this.name + "が咲いた。");
	}
		
}
