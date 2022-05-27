package world;

public class Matango {
	// フィールド
	public int hp;
	public final int LEVEL = 10; // 定数フィールド（定数名は大文字）
	public char suffix;
	
	// メソッド
	public void runaway() {
		System.out.println
			("お化けキノコ" + this.suffix + "は、逃げ出した！");
	}

}
