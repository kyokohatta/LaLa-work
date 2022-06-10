package chap15;

public class Main557 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		// equalsIgnoreCase .. 大文字小文字の区別はしない場合の比較 Stringメソッド
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケース(大文字小文字)を区別しなければ等しい");
		}
		// length() .. 文字列の長さを調べる Stringメソッド
		System.out.println("s1の長さは、" + s1.length() + "です。");
		
		// isEmpty() .. 空文字(長さが0か)を調べる Stringメソッド
		if (s4.isEmpty()) {
			System.out.println("s4は空文字です");
		}
	}

}
