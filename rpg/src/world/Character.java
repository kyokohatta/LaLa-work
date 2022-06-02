package world;

// 第11章 抽象クラスの作成
// abstract を付ける。

public abstract class Character {
	public String name;
	public int hp;
	
	// コンストラクタ
	public Character() {}
	public Character(String name) {
		System.out.println("Characterのコンストラクタが動作");
		this.name = name;
	}
	
	// 抽象メソッド
	// abstract を付ける。
	// { } は、付けない。
	public abstract void attack(Matango m);
	
	// メソッド
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public void sleep() {
		System.out.println(this.name + "は、眠った。");
		System.out.println("hpは１０ポイント回復した。");
		this.hp += 10;
	}

	
}
