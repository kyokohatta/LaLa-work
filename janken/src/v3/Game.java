package v3;

import java.util.Scanner;

public class Game {
	// フィールド変数(クラス変数)
	private String msg = null;

	// judge()メソッド (引数は、参照渡し)
	public void judge(Com com, User user) {
		int comHand = com.getHand(); // 0.1.2を受け取る
		int userHand = user.getHand();

		if (userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです。";
		} else if ((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			msg = user.getName() + "の勝ちです。";
		} else {
			com.setResult("win");
			user.setResult("lose");
			msg = com.getName() + "の勝ちです。";
		}
	}

	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果========");
		System.out.println(com);
		System.out.println(user);
		System.out.println(msg);

	}

//	public String convToJp(Com com) {
//		if (com.getResult().equals("lose")) {
//			return "あなたの勝ちです。";
//		} else if (com.getResult().equals("win")) {
//			return "私の勝ちです。";
//		} else {
//			return "引き分けです。";
//		}
//	}

	public boolean isNext() {
		System.out.print("もう一度やりますか？ y/n >> ");
		// yかnを入力してもらい、小文字にしてyesnoに代入。
		String yesno = new Scanner(System.in).nextLine().toLowerCase();

		if (yesno.equals("y")) {
			return true;
		} else {
			return false;
		}
	}

}
