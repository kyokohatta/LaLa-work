package world;

public class Animal {
	public String name;
	public int hp = 10;
	public boolean life = true;
	
	
	// コンストラクタ（オーバーロード）
	public Animal() {
		this.name = "アニマル";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	// メソッド
	public void eat() {
		if(this.life = true) {
		System.out.println(this.name + "は、食べた。");
		hp10Plus();
		}
	}
	
	public void go() {
		if(this.life = true) {
		System.out.println(this.name + "は、走った。");
		hp5Minus();
		dead();
		}
	}
	
	public void dead() {
		if(this.life = true) {
			if (this.hp < 1) {
			System.out.println(this.name + "は、死んだ。");
			this.life = false;
			}
		}
	}
	
	//メソッドの小分け部分
	public void showHp() {
		System.out.println("今のHPは、" + this.hp);
	}
	
	public void hp5Minus() {
		System.out.println("hpを５使った。");
		this.hp -= 5;
	}
	
	public void hp10Plus() {
		System.out.println("hpが10上がった。");
		this.hp += 10;
	}
	
}
