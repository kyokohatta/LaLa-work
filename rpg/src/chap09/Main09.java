package chap09;

import world.Hero;
import world.Hero_chap13;
import world.Sword;
import world.Wand;
import world.Wizard;

public class Main09 {
	public static void main(String[] args) {
		
		// P339
		System.out.println(">> P339ページ");
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2;
		h2 = h1;  // 参照(アドレス情報)を代入
		h2.hp = 200;
		System.out.println("HERO h1のhpは、" + h1.hp);
		System.out.println(" ");
		
		// P343
		System.out.println(">> P343ページ");
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero_chap13 h = new Hero_chap13("ミナト");
		//h.name = "ミナト";
		h.setHp(100);
		h.sword = s;
		System.out.println("HERO " + h.getName() + "は、" + h.sword.name + "を手に入れた。" );
		
		h.attack(m);
		System.out.println(" ");
		
		// P345
		System.out.println(">> P345ページ");
		Hero h3 = new Hero();
		h3.name = "アサカ";
		h3.hp = 100;
		Wizard w = new Wizard(Wand("魔法の杖"));
		w.setName("スガワラ");
		w.setHp(50) ;
		w.heal(h);  // ミナトを回復させる。(HP:100 → 110)
		System.out.println(h.name + "のHP：" + h.hp );
		w.heal(h3); // アサカを回復させる。(HP:100 → 110)
		w.heal(h3); // アサカを回復させる。(HP:110 → 120)
		System.out.println(h3.name + "のHP：" + h3.hp );
		System.out.println(" ");
		
		// P356 Hero()にコンストラクタを設定した。
		System.out.println(">> P356ページ");
		Hero p356 = new Hero("ミナト");
		System.out.println(p356.hp);
		System.out.println(p356.name);
		System.out.println(" ");
		
		// P362 別のコンストラクタを呼び出す
		System.out.println(">> P362ページ");
		Hero p362 = new Hero();
		System.out.println(p362.name);
	}

	private static Wand Wand(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
