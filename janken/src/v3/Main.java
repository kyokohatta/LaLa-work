package v3;

public class Main {

	public static void main(String[] args) {
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		com1.setHand();
		user.setHand();
		
		// それぞれの手から、判定
		Game game = new Game();
		game.judge(com1, user);
		
		game.dispResult(com1, user);
		
		// toString()メソッドを呼び出す
		// System.out.println(com1); // com1.toString() の略
		// System.out.println(user); // user.toString() の略

	}

}
