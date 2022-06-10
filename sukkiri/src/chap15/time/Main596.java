package chap15.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main596 {

	public static void main(String[] args) {
		// 文字列からLocakDateを生成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/12/22", fmt); // parse .. 解析
		System.out.println(ldate + "\n");
		
		// 1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println(ldatep);
		System.out.println(ldate + "より1000日後は、" + str + "\n");
		
		// 現在日付との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println(ldate + "より1000日後は過去日付です。");
		}
		if (now.isBefore(ldatep)) {
			System.out.println(ldate + "より1000日後は未来の日付です。");
		}

	}

}
