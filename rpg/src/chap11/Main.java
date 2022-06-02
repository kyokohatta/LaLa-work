package chap11;

// 第11章

import world.Dancer;
import world.Goblin;
import world.Matango;
import world.SuperHero;

public class Main {
	
	public static void main(String[] args) {
		
		Matango m = new Matango('A');
		Dancer dancer = new Dancer(); 
		
		dancer.attack(m);
		dancer.dance();
		dancer.run();
		dancer.sleep();
		
		SuperHero h = new SuperHero("アシリパ");
		h.attack(m);
		h.run();
		h.sleep();
		
		// p433
		Goblin goblin = new Goblin();
		goblin.hp = 80 ;
		goblin.attack();
		goblin.run();
		
		
	}

}
