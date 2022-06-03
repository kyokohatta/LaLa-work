package world;

public class Slime extends Monster {
	char suffix = 'S';
	public void run() {
		System.out.println("スライムはサササっ逃げ出した。");
	}

	// @Override
	public void attack(Hero h) {
		System.out.println("スライム" + this.suffix + "の攻撃！========");
		System.out.println(h.name + "に、1のダメージ");
		h.hp -= 1;
		System.out.println(h.name + "のHPは、" + h.hp + "になった。");
		
	}
}
