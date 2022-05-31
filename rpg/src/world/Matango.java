package world;

// P401 練習問題 10 で追記

public class Matango {
	// フィールド
	public int hp = 50;
	public final int LEVEL = 10; // 定数フィールド（定数名は大文字）
	public char suffix;
	
	// コンストラクタを設定
	public Matango() {}
	public Matango(char suffix) {
		this.suffix = suffix;
		System.out.println("Matangoのコンストラクタが動作");
	}
	
	// メソッド
	public void runaway() {
		System.out.println
			("お化けキノコ" + this.suffix + "は、逃げ出した！");
	}
	
	public void attack(Hero_chap10 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！========");
		System.out.println(h.name + "に、10のダメージ");
		h.hp -= 10;
		System.out.println(h.name + "のHPは、" + h.hp + "になった。");
	}

}
