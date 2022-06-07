package chap14;

public class Main545 {
	public static void main(String[] args) {
		// P545
		System.out.println("P545=============");
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(" ");
		
		// P548
		System.out.println("P548=============");
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		
		Hero h1 = new Hero();
		System.out.println(h1.money);
	}

}
