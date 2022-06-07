package chap14;

public class Main {

	public static void main(String[] args) {
		Empty e = new Empty();
		System.out.println(e); // empty の toString()を呼び出している。
		System.out.println(" ");

		// P535
		System.out.println("P535=============");
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;

		if (h1.equals(h2) == true) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
		System.out.println(" ");
		
		// P543
		System.out.println("P543=============");
		System.out.println("h1 HP : " + h1.hp);
		
		Hero.money = 300;
		h1.money = 100;
		h2.money = 200;
		
		// 静的フィールド money へのアクセス
		System.out.println("Hero.money : " + Hero.money);
		System.out.println("h1.money : " + h1.money);
		System.out.println("h2.money : " + h2.money);
		
		
	}

}
