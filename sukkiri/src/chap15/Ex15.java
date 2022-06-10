package chap15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Ex15 {

	public static void main(String[] args) {
		// 練習問題15-1
		System.out.println(">> 練習問題15-1");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<100; i++) {
			sb.append(i+1);
			sb.append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		
		String[] a = s.split("[,]");
		for (String val : a) {
			System.out.println(val);
		}
		
		// 練習問題15-2
		System.out.println(">> 練習問題15-2");
		String folder = "c:\\javadev";
		String file = "readme.txt";
		String path = connect(folder, file);
		System.out.println(path + "\n");
		
		// 練習問題15-3
		// 1) .matches(".*");
		// 2) .matches("A[0-9][0-9]?"); もしくは "A\d{1,2}"
		// 3) .matches("U[A-Z]{3}");
		
		
		// 練習問題15-4
		System.out.println(">> 練習問題15-4");
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		System.out.println(now);
		System.out.println(c);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day：" + day);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future1 = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String sFuture = f.format(future1);
		System.out.println(sFuture + "\n");
		
		
		// 練習問題 15-5
		System.out.println(">> 練習問題15-5");
		LocalDate now2 = LocalDate.now();
		System.out.println(now2);
		LocalDate future2 = now2.plusDays(100);
		System.out.println(future2);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String str = future2.format(fmt);
		System.out.println(str);
	}
	
	// 練習問題15-2
	public static String connect(String folder, String file) {
		if(!(folder.matches(".*\\$"))) {
			folder += "\\";
		}
		return folder + file;
	}
	
}
