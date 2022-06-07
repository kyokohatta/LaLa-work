package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		// ユーザーが012以外の数字を入力したら、
		// もう一回入力してもらう do while文

		int hand = -1;

		do {
			System.out.println("手を選択してください。");
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.print(" > ");
			try {
				hand = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				// どこでエラーが起こっているか画面に表示する
				// e.printStackTrace();
				System.out.println("※0か1か2を入力してください。");
			}
		} while (hand < 0 || hand > 2);

		return hand;

	}

}
