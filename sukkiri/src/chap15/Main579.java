package chap15;

import java.util.Date;

public class Main579 {
	
	public static void main(String[] args) {
		
		// P579 処理時間を計測する
		System.out.println("> long型を使った日時情報の数値化");
		long start = System.currentTimeMillis();
		
		// ここで何らかの時間がかかる処理
		// Thread.sleep .. プログラムの一時停止
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("エラーが起こった");
			System.out.println(e.getMessage());
		}
		
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・"
				+ (end - start) + "ミリ秒でした。\n");
		
		// P580 Date型を使った日時情報
		System.out.println("> Date型を使った日時情報の数値化");
		Date now = new Date();
		System.out.println(now); // 見やすく表示されるのはDate()クラスのtoStringメソッドのオーバーライドのおかげ。
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past + "\n");
		
		
	}

}
