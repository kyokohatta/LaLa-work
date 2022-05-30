package world;

// P364 練習問題9

public class Thief {
	public String name;
	public int hp;
	public int mp;
	
	public Thief (String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
		this("name", hp, 5);
	}
	
	public Thief(String name) {
		this("name", 40);
	}
	
}
