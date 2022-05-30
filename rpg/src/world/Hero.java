package world;

public class Hero {
	// フィールド(field)「属性の定義」
	// ・・ここに宣言したものは、勝手に初期化される。
	
	public String name; // public .. 違うパッケージからでも見える化する。
	public int hp;
	
	// Sword クラスで定義したものを宣言。p.342
	// HeroクラスにSwordクラスが属している。
	public Sword sword;
	
	
	/**
	 * P.355
	 * コンストラクタ (new Hero()したら、自動的実行されるメソッド）
	 * 引数の数でオーバーロード
	 * @param なし
	 * @param name String
	 */
	
	public Hero() {
		this("ダミー"); // P362 別のコンストラクタを呼び出す this(引数);
	}
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	
	// メソッド「操作の定義」
	
	public void attack() {
		System.out.println(this.name + "は、" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + " 秒座った！");
		System.out.println("HPが " + sec + " ポイント回復した。");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5 のダメージ！");
	}
	
	public void runaway() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println(this.name + "の最終HPは、" + this.hp + "でした。");
	}
	
}
