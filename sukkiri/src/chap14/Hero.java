package chap14;

public class Hero {
	String name;
	int hp;
	// P542 静的フィールド(static field)
	static int money;
	
	// P547
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000); // 0～999.99999
	}
	
	
	
	
	// 何を以て意味的に同じとするかを設定。
	// equals のオーバーライド
	// 名前が同じなら同じ勇者とする equals()を定義
	
	public boolean equals(Object o) {
		// 保存されているアドレス先が同じ場合
		if (this == o) {
			return true;
		}
		// o オブジェクトがHero型の場合
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	
	}
}
