package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		
		Player com = new Player(new CleverNextHand());
		System.out.println("com1の次の手は " + com.getHand() + "です。");
		
		
		Player com2 = new Player(new RandomNextHand());
		System.out.println("com2の次の手は " + com2.getHand() + "です。");
	}

}
