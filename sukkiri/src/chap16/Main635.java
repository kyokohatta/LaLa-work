package chap16;

import java.util.HashMap;
import java.util.Map;

public class Main635 {

	public static void main(String[] args) {
		
		// HashMap .. 連想配列的なやつ
		
		Map<String, Integer> prefs = new HashMap<>();
		
		// 格納 prefs.put(key, null)
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);
		
		// 京都府の削除
		prefs.remove("京都府");
		// 熊本県の上書き
		prefs.put("熊本県", 182);
		
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto + "\n");
		
		
		
		// P636 連想配列の取り出し

		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
		

	}

}
