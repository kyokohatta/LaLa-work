package chap16;

import java.util.ArrayList;
import java.util.Iterator;

public class Main620 {

	public static void main(String[] args) {
		// イテレータを使った ArrayList の繰り返し処理
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("ミナト");
		names.add("アサカ");
		names.add("スガワラ");
		
		// .iterator()メソッド .. Iterator のインスタンスを生み出す(newしてる)
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}

	}

}
