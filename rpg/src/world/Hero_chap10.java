package world;

public class Hero_chap10 {
	public String name = "ミナト";
	public int hp = 100;
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println(m.suffix + "に5ポイントのダメージを与えた。");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
}
