package world;

public class Deathbat extends FlyingMonster {

	public void attack() {
		System.out.println("突っつく。");
			
	}

	@Override
	public void attack(Hero h) {
		System.out.println("突っつく。");
		
	}


}
