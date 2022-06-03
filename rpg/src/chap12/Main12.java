package chap12;

import world.Character;
import world.Hero_chap10;
import world.Matango;
import world.Monster;
import world.Slime;
import world.Wizard;

public class Main12 {
	public static void main(String[] args) {
		// P470
		System.out.println(">> P470 ");
		Character c = new Wizard();
		// キャスト演算子を入れると、強制的にWizard型に入れられる。
		// ダウンキャスト .. あいまいな型に入っている中身を厳密な型に代入する。
		if (c instanceof Wizard) {
			System.out.println("いいよ");
		}
		Wizard w = (Wizard) c;
		
		Matango m = new Matango('A');
		
		if (c instanceof Hero_chap10) {
			Hero_chap10 h = (Hero_chap10) c;
			h.attack(m);
		}
		
		w.setName("アサカ");

		c.attack(m);
		// firevall()は、w.fireball(m)なら使えるが、
		// c.fireball(m)だと使えなくなってしまう。
		w.fireball(m);
		System.out.println(" ");

		// P474
		System.out.println(">> P474 ");
		// Slime 型の Slimeインスタンス
		Slime s = new Slime();
		// Monster 型の Slimeインスタンス
		Monster m2 = new Slime();
		s.run();
		m2.run();
		System.out.println(" ");
	}
}
