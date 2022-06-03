package world;

public abstract class FlyingMonster extends Monster {
	
	public void run() {
		System.out.println("バサバサ飛んで逃げる。");
	}
	
	public void attack() {
		System.out.println("突っつく。");
		
	}
}
