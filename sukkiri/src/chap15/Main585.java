package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat f =
				new SimpleDateFormat("yyy/MM/dd");
		
		// 文字列からDateインスタンスを生成
		Date d = f.parse("2025/05/01");
		System.out.println(d);
		
		// Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在日時：" + s);
		long l = d.getTime() - now.getTime();
		System.out.println(l);
	
	}

}
