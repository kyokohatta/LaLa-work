package Chap05;

// P193 メソッドの呼び出し

public class Main5_4 {

	public static void main(String[] args) {
		// P192 引数1つの場合
		System.out.println("メソッドを呼び出します");
		String msg = "五郎";
		
		hello("湊");
		hello("浅香");
		hello("菅原");
		hello(msg);
		
		System.out.println("メソッド呼び出しが終わりました");
		
		// P198　引数2つの場合
		int x = 100;
		int y = 10;
		int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + ans);

	}
	
	// hello(型 パラメータ)  メソッド本体
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;  // return の役割 .. 値を戻し、メソッドをここで終了
	}

}
