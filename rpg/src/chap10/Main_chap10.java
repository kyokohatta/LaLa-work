package chap10;

import world.Hero_chap10;
import world.PoisonMatango;
import world.SuperHero;
import world.Weapon;

public class Main_chap10 {

	public static void main(String[] args) {
		
		// P.389 コンストラクタの動作を確認
		// SuperHeroを動かしたら、Heroのコンストラクタも動く。
		System.out.println(">> P389 ");
		SuperHero sh = new SuperHero();
		System.out.println(" ");
		
		// P.393 コンストラクタ　親と子の関係
		System.out.println(">> P393 ");
		Weapon w = new Weapon();
		System.out.println(w.name);
		System.out.println(" ");
		
		
		// P402 練習問題 10
		System.out.println(">> P402 練習問題10 ");
		Hero_chap10 h = new Hero_chap10();
		PoisonMatango pm = new PoisonMatango('A');
		SuperHero sh2 = new SuperHero("きょん");
		
		pm.attack(h);
		pm.attack(sh2); // SuperHeroは Heroの子クラスなので、Hero型に当てはまった。
		h.attack(pm);   // PoisonMatangoは Matangoの子クラスなので、Matango型に当てはまった。
		sh2.attack(pm);

	}
	

}
