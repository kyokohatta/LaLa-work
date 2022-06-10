package chap15.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//

public class Main594 {

	public static void main(String[] args) {
		// LocalDateTime の生成方法
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5);
		System.out.println(l1);
		System.out.println(l2 + "\n");
		
		// LocalDateTime と ZonedDateTime の相互変換
		// LocalDateTime はタイムゾーン情報を持たないので、
		// ZonedDateTime に変換しても、日時に変化はない。
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3 + "\n");

	}

}
