package world;

public class Dancer extends Character {

	// コンストラクタ
	public Dancer() {
		setName("ダンサー");
	}
	
	// 実装されていない抽象メソッドのオーバーライド
	@Override
	public void attack(Matango m) {
		System.out.println(this.getName() + "の攻撃 ========");
		System.out.println("敵に３ポイントのダメージ！");
		m.hp -= 3;
	}
	
	
	// 普通に Dancer 特有の追加メソッド
	public void dance() {
		System.out.println(this.getName() + "は、情熱的に踊った。");
	}
	

}
