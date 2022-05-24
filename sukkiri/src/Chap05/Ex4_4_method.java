package Chap05;

// Ex4_4aをメソッドブロックに分けて定義すると・・・


public class Ex4_4_method {

	public static void main(String[] args) {
		int[] randomNum = new int[2];
		ready(randomNum);
		int inputNum = input();
		hantei(randomNum, inputNum);

	}
	
	// 1) ready() .. ランダムでかぶらない2つの１桁の数を決めるメソッド
	// 配列は、参照渡しのため、returnはいらない。そのまま元の配列が書き換えられる。
	public static void ready(int[] randomNum) {
		randomNum[0] = new java.util.Random().nextInt(9) + 1;
		
		do {
			randomNum[1] = new java.util.Random().nextInt(9) + 1;
		} while(randomNum[0] == randomNum[1]);
		
		System.out.println(randomNum[0]);
		System.out.println(randomNum[1]);
	}
	
	// 2) input() .. ユーザー入力するメソッド
	public static int input() {
		System.out.println("1桁の数字を入力してください。");
		int inputNum = new java.util.Scanner(System.in).nextInt();
		return inputNum;
	}
	
	// 3) hantei() .. 判定作業するメソッド
	public static void hantei(int[] randomNum, int inputNum) {
		for (int val : randomNum) {
			if (val == inputNum) {
				System.out.println("アタリ!");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
	}

}
