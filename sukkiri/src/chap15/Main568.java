package chap15;

public class Main568 {

	public static void main(String[] args) {
		// 正規表現
		String name = "T1234567";
		String name2 = "00000000";
		
		hantei(name);
		hantei(name2);
		
		// P576 フォーマット文字列
		// String.format() もしくは Printf()
		System.out.printf("製品番号%s-%02d", "SJV", 3);

	}
	
	// 正規表現チェック(Stringクラス)
	// P569
	// matches("文字列パターン")メソッド .. パターンマッチング
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	
	public static void hantei(String name) {
		if (isValidPlayerName(name)) {
			System.out.println(name + ": OK");
		} else {
			System.out.println(name + ": NG");
		}
	}

}
