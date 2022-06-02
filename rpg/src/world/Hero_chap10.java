package world;

public class Hero_chap10 extends Character {
	
    // this.name = "ミナト";
	// this.hp = 100;
	
	// コンストラクタの設定
	public Hero_chap10() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero_chap10(String name) {
		super(name);
		System.out.println("Heroのコンストラクタが動作");
	}
	
	// メソッド
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！========");
		m.hp -= 5;
		System.out.println("キノコ" + m.suffix + "に5ポイントのダメージを与えた。");
		System.out.println("キノコ" + m.suffix + "のHPは、" + m.hp + "になった。");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
}

