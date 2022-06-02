package world;

// 第11章 P433 モンスターという抽象クラス

public abstract class Monster {
	public int hp = 100;
	public int mp = 10;
	
	// 
	public abstract void attack();
	public abstract void run();
}
