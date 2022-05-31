package world;

// P402 練習問題 10

public class PoisonMatango extends Matango {
	
	// フィールド設定
	public int poisonCount = 5;
	
	// コンストラクタを設定
	public PoisonMatango(char suffix) {
		super(suffix);
		System.out.println("PoisonMatangoのコンストラクタが動作");
	}
	
	// メソッド
	public void attack(Hero_chap10 h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damagePoint = h.hp / 5;
			h.hp -= damagePoint;
			System.out.println(h.name + "に、" + damagePoint + "ポイントのダメージ！");
			System.out.println(h.name + "のHPは、" + h.hp + "になった。");
			this.poisonCount -= 1;
			
			System.out.println("毒攻撃の残り回数： " + poisonCount);
		}
		
		
	}
	
	

}
