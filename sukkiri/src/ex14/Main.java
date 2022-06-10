package ex14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);

		Account b = new Account();
		b.accountNumber = "  4649  ";
		b.balance = 666;

		if (a.equals(b)) {
			System.out.println("同じ口座番号です。");
		} else {
			System.out.println("違う口座番号です。");
		}

		a.accountNumber = "4649";
		List<Account> aList = new ArrayList<>(); // 自由のきく配列みたいなもん
		aList.add(a);
		showList(aList);
		b = new Account();
		b.accountNumber = "4649";
		b.balance = 555;
		showList(aList);
		aList.remove(b);
		showList(aList);


	}
	
	// このクラスだけで使えるListの中身を表示するメソッド .. private
	private static void showList(List<Account> list) {
		for (Account val : list) {
			System.out.print("accountNumber : " + val.accountNumber);
			System.out.println("  balance : " + val.balance);
		}
		System.out.println("Listの要素数：" + list.size());
	}

}
