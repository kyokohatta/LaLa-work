package world;

// P499 第13章

public class Hero_chap13 {
	
	// カプセル化.. private : 自分自身のクラスのみアクセス許可
    private int hp;
    
    private String name;
    private Sword sword;
    
	
	// コンストラクタの設定
	public Hero_chap13() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero_chap13(String name) {
		this.name = name;
		System.out.println("Heroのコンストラクタが動作");
	}
	
	// getter(ゲッター) と setter(セッター)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// メソッド
	// 眠る　アクセス修飾子なし：自分と同じパッケージに属するクラスのみアクセス許可。(パッケージプライべート)
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した。");
	}
	
	// 死ぬ  private : 自分自身のクラスのみアクセス許可
	private void die() {
		System.out.println(this.name + "は、死んでしまった。");
		System.out.println("!!! GAME OVER !!!!");
	}
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！========");
		m.hp -= 5;
		System.out.println("キノコ" + m.suffix + "に5ポイントのダメージを与えた。");
		System.out.println("キノコ" + m.suffix + "のHPは、" + m.hp + "になった。");
		// P494 追記
		System.out.println("お化けキノコ" + m.suffix + "から２ポイントの反撃を受けた。");
		this.hp -= 2;
		if(this.hp <= 0) {
			this.die();
		}
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	
	
	
	
}

