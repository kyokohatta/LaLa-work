package chap15.time;

// java.time パッケージ　Insantクラスと ZonedDateTimeクラス

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main591 {

	public static void main(String[] args) {
		// Instant の生成
		Instant i1 = Instant.now(); // 現在の日時を取得(イギリス基準) newしてる感じ
		System.out.println(i1 + "\n");

		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		System.out.println(i2);
		System.out.println(l + "\n");

		// ZonedDateTime の生成
		ZonedDateTime z1 = ZonedDateTime.now(); // タイムゾーンを考慮した現在日時の取得　newしてる感じ
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println(z1);
		System.out.println(z2 + "\n");
		
		// Instant と ZonedTime の相互変換
		Instant i3 = z2.toInstant(); // Instantクラスに変換 .. toInstant()
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London")); // ZonedDateTimeクラスに変換 .. atZone(ZonedId.of("")
		System.out.println(i3);
		System.out.println(z3 + "\n");
		
		// ZonedDateTime の利用方法
		System.out.println("東京" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		// 同じ瞬間の判定には、equals()ではなく「isEqual()」を使う。
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています。");
		}
		

	}

}
