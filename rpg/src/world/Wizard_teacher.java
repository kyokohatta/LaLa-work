package world;

public class Wizard_teacher {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard_teacher(Wand wand) {
		this.setWand(wand);
	}
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.hp = h.hp + recovPoint;
		System.out.println
		  (h.name + "のHPを" + recovPoint + "回復した。");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に３ポイントのダメージ");
		m.hp = m.hp - 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った!");
		System.out.println("敵に２０ポイントのダメージを");
		m.hp = m.hp - 20;
		this.mp = this.mp - 5;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			String msg = "mpは 0 以上です";
			throw new IllegalArgumentException(msg);
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			String msg = "名前が短いです";
			throw new IllegalArgumentException(msg);
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			String msg = "杖が指定されていません。";
			throw new IllegalArgumentException(msg);
		}
		this.wand = wand;
	}
}
