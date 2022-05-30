package ex09;

import world.Thief;

public class Main_ex09 {
	public static int heal(int hp) {
		hp += 10;
		return hp;
	}
	public static int heal(Thief thief) {
		thief.hp += 10;
		return thief.hp;
	}

	public static void main(String[] args) {
			
		// ex 9-2
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		
		System.out.println("baseHpは " + baseHp + "：t.hpは " + t.hp);
		System.out.println(" ");
		
		int h = heal(baseHp);  // 35 ただし、int型は、データ参照型→値渡し
		int hp = heal(t); // t = 25 + 10 = 35　thief型(クラス型)は、参照型→参照渡し
		
		System.out.println("heal(baseHp)は、" + h);
		System.out.println("heal(t)は、" + hp);
		System.out.println(" ");
		
		System.out.println("baseHpは " + baseHp + "：t.hpは " + t.hp);

	}

}
