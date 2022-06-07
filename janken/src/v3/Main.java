package v3;

public class Main {

	public static void main(String[] args) {
		// Constクラスの定数を呼び出す
		System.out.println("NINZU: " + Const.NINZU);
		
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");
		
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		System.out.println("＞＞ 一回だけじゃんけん");
		com1.setHand();
		user.setHand();
		
		// それぞれの手から、判定
		Game game = new Game();
		game.judge(com1, user);
		
		game.dispResult(com1, user);
		System.out.println("　");
		
		// toString()メソッドを呼び出す
		// System.out.println(com1); // com1.toString() の略
		// System.out.println(user); // user.toString() の略
		
		User user2 = new User(new RandomNextHand());
		user2.setName("あなた");
		Game game2 = new Game();
		
		System.out.println("＞＞ あなたが勝つまでじゃんけん");
		// user2 が win になるまでじゃんけんする設定
		do {
			com1.setHand();
			user2.setHand();
			game2.judge(com1, user2);
			game2.dispResult(com1, user2);
		} while(!(user2.getResult().equals("win")));
		System.out.println("　");
		
		System.out.println("＞＞ 気が済むまでじゃんけん");
		// gameクラスのisNext()メソッドがtrueの間じゃんけんする設定
		do {
			com1.setHand();
			user2.setHand();
			game2.judge(com1, user2);
			game2.dispResult(com1, user2);
		} while(game.isNext());
		System.out.println("　");
		
		System.out.println("＞＞ CleverNextHandとじゃんけん");
		com1.setNextHand(new CleverNextHand());
		com1.setHand();
		user.setHand();
		game.judge(com1, user);
		game.dispResult(com1, user);
	}

}
