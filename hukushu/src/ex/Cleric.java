package ex;

public class Cleric {
	String name;
	int hp = 10;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 50;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	
	public int pray(int playSec) {
		int kaihukMp = new java.util.Random().nextInt(3) + playSec;
		if((kaihukMp + this.mp) < this.MAX_MP) {
			return kaihukMp;
		}
		return this.MAX_MP;
	}
}
