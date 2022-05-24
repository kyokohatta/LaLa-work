// P176 練習問題4-2と4-4

package Chap04;

public class Ex4_2_4 {

	public static void main(String[] args) {
		Ex4_2();
		Ex4_4();
		Ex4_4a();
	}
	
	
	public static void Ex4_2() {
		// 1)
		int[] moneyList = {121902, 8302, 55100};
		
		// 2)for文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);	
		}
		
		// 3)拡張for文
		for(int money : moneyList) {
			System.out.println(money);	
		}
	}
	
	public static void Ex4_4() {
		// 1)配列の準備
		int[] numbers = {3, 4, 9};
		
		// 2)メッセージの表示
		System.out.println("1桁の数字を入力してください。");
		
		// 3)キーボートから数字の入力
		int input = new java.util.Scanner(System.in).nextInt();

		// 4)配列を回しながら判定（for文）
		for (int i=0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ!");
			} else {
				System.out.println("はずれ");
			}
		}
		
		// 4)配列を回しながら判定（拡張for文)
		for (int val : numbers) {
			if (val == input) {
				System.out.println("アタリ!");
			} else {
				System.out.println("はずれ");
			}
		}
	}
		
	public static void Ex4_4a() {
		// 1)ランダムでかぶらない2つの１桁の数
		int[] randomNum = new int[2];
		randomNum[0] = new java.util.Random().nextInt(9) + 1;
		
		do {
			randomNum[1] = new java.util.Random().nextInt(9) + 1;
		} while(randomNum[0] == randomNum[1]);
		
		System.out.println(randomNum[0]);
		System.out.println(randomNum[1]);
		
		// 2)ユーザー入力
		System.out.println("1桁の数字を入力してください。");
		int input2 = new java.util.Scanner(System.in).nextInt();
		
		// 3)判定作業
		for (int val : randomNum) {
			if (val == input2) {
				System.out.println("アタリ!");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
	}

}
