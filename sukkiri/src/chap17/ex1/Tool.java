package chap17.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tool {
	// メソッド①
	public int inputNum() {
		boolean isNum = false;
		int num = 0;

		do {
			System.out.print("数字を入力 > ");
			String numText = new Scanner(System.in).nextLine();

			try {
				num = Integer.parseInt(numText);
				isNum = true;
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("数字やで！もう一度入力して！");
			}
		} while (isNum == false); // (! isNum)と書いてもいい。

		return num;
	}
	
	// メソッド②
	public int getNum() {
		boolean isNum = false;
		int num = 0;
		
		while (! isNum) {
			System.out.print("数字を入力 > ");
			try {
				num = new Scanner(System.in).nextInt();
				isNum = true;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("数字でね！もう一回！");
			}
		}
		return num;
	}
}
