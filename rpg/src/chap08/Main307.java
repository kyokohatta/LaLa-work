package chap08;

import world.Hero;
import world.Matango;

public class Main307 {

	public static void main(String[] args) {
		// 勇者よ、この仮想世界に生まれよ！
		// 1.勇者を生成
		Hero minatoHero = new Hero(); // Hero() .. コンストラクタ　minatoHero .. インスタンス
		// 2.フィールドに初期値をセット
		minatoHero.name = "ミナト";
		minatoHero.hp = 100;
		System.out.println("勇者" + minatoHero.name + "を生み出した！");
		
		// お化けキノコよ、この仮想世界に生まれよ！
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// 冒険のはじまり
		minatoHero.slip();
		m1.runaway();
		m2.runaway();
		minatoHero.runaway();
		

	}

}
