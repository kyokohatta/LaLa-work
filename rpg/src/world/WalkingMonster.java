package world;

public abstract class WalkingMonster extends Monster {
		
	public abstract void attack();
	
	public void run() {
		System.out.println("トコトコ走って逃げる。");
	}
}
