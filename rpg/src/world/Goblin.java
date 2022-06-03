package world;

public class Goblin extends WalkingMonster {
	

	// @Override
	public void attack() {
		System.out.println("ナイフで切りつける");
		
	}

	@Override
	public void attack(Hero h) {
		System.out.println("ナイフで切りつける");
		
	}
		
}
