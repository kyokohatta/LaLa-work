package world;

public class Wizard extends Character {
	public int mp;
	
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(this.getName() + "は、" + h.name + "のHPを10回復した。");
	}

	// @Override
	public void attack(Matango m) {
		System.out.println(this.getName() + "の攻撃！=========");
		System.out.println("キノコ" + m.suffix + "に5ポイントのダメージを与えた。");
		System.out.println("キノコ" + m.suffix + "のHPは、" + m.hp + "になった。");
		m.hp -= 3;
		
	}
	
	public void fireball(Matango m) {
		System.out.println(this.getName() + "は、火の玉を放った！");
		System.out.println("キノコ" + m.suffix + "に20ポイントのダメージ。");
		System.out.println("キノコ" + m.suffix + "のHPは、" + m.hp + "になった。");
		System.out.println(this.getName() + "はmp を５消費。");
		System.out.println(this.getName() + "のmpは、" + this.mp + "になった。");
		m.hp -= 20;
		this.mp -= 5;
	}
	
	
}
