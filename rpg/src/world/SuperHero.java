package world;

public class SuperHero extends Hero_chap10 {
	
	// コンストラクタの設定
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタの動作");
	}
	public SuperHero(String name) {
		super(name); // 親コンストラクタを呼び出し P.391
		System.out.println("SuperHeroのコンストラクタの動作");
	}
	
	// 拡張機能だけを追記
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した。");
	}
}
