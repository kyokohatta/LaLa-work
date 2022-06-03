package chap12;

import world.Deathbat;
import world.Goblin;
import world.Monster;
import world.Slime;

public class Main485 {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new Deathbat();
		
		for (Monster m : monsters) {
			m.run();
		}
	}

}
