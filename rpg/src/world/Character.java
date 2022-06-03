package world;

// 第11章 抽象クラスの作成
// abstract を付ける。

public abstract class Character {
	private String name;
	private int hp;
	
	// コンストラクタ
	public Character() {}
	public Character(String name) {
		System.out.println("Characterのコンストラクタが動作");
		this.name = name;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// 抽象メソッド
	// abstract を付ける。
	// { } は、付けない。
	public abstract void attack(Matango m);
	// public abstract void fireball(Matango m);
	
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
