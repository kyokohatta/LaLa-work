package v3;

public class Game {
	
	// judge()メソッド (引数は、参照渡し)
	public void judge(Com com, User user) {
		int comHand = com.getHand(); // 0.1.2を受け取る
		int userHand = user.getHand();
		
		if(userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
		} else if ((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
		} else {
			com.setResult("win");
			user.setResult("lose");
		}
	}
	
	public void dispResult(Com com,User user) {
		System.out.println("ゲーム結果========");
		System.out.println(com);
		System.out.println(user);
		System.out.println(convToJp(com));
		
	}
	
	public String convToJp(Com com) {
		if (com.getResult().equals("lose")) {
			return "あなたの勝ちです。";
		} else if (com.getResult().equals("win")) {
			return "私の勝ちです。";
		} else {
			return "引き分けです。";
		}
	}
	
	

}
