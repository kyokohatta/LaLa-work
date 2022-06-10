package chap15;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		// P583 Calenderクラスの利用
		// Calendarクラスは「new」ではなく「getInstance()」でインスタンスを生成
		// 6つのint値とDate型の相互変換
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22, 1, 23, 45);
		System.out.println(c);
		
		Date d1 = c.getTime();
		System.out.println(d1);
		
		c.set(Calendar .MONTH, 9); // 月を9(10月)に変更
		Date d = c.getTime(); // Date型に変換
		System.out.println(d + "\n");
		
		Date now = new Date();
		c.setTime(now);
		System.out.println(c.getTime());
		System.out.println("YEAR：" + c.get(Calendar.YEAR));
        System.out.println("MONTH：" + c.get(Calendar.MONTH)); 
        System.out.println("DATE：" + c.get(Calendar.DATE)); 
	}

}
