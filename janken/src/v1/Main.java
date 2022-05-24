package v1;

// P216 コマンドライン引数を設定
// 実行 ⇒ 実行構成 ⇒ プロジェクト、メイン・クラスを確認
// ⇒引数のタブ ⇒ プログラムの引数(A)に、好きな名前を入力

public class Main {

	public static void main(String[] args) {
		
		// もし、コマンドライン引数(args)を定義していたら、定義の名前
		// 定義されていなかったら、userNameに"才蔵"と入れる。
		String userName = "";
		if (args.length == 1) {
			// プレイヤーの名前を受け取る(コマンドライン引数を利用）
			userName = args[0];
		} else {
			userName = "才蔵";
		}
		
		String[] hand = {"グー", "チョキ", "パー"};
			
		int com = com();
		int user = userInput();
		
		System.out.println("私の手は" + hand[com] + "です。");
		System.out.println(userName + "さんの手は" + hand[user] + "です。");
		
		hantei(com, user, userName);
	}
	
	// com() .. ランダムにじゃんけんの手を決めるメソッド
	public static int com() {
		int num = new java.util.Random().nextInt(2);
		return num;
	}
	
	// userInput() .. ユーザに0.1.2を入力してもらい手を決めるメソッド
	public static int userInput() {
		System.out.println("0:グー 1:チョキ 2:パー");
		System.out.print("0か1か2を入力してください > ");
		int numPlayer = new java.util.Scanner(System.in).nextInt();
		return numPlayer;
	}
	
	// haitei() .. コンピュータとユーザどちらが勝ったか判定するメソッド
	public static void hantei(int com, int user, String name) {
		int hantei = (user + 1) % 3;
		
		if(com == user) {
			System.out.println("引き分けです。");
		} else if (hantei == com) {
			System.out.println(name + "さんの勝ちです。");
		} else {
			System.out.println(name + "さんの負けです。");
		}
	}

}
