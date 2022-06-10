package chap16;

import java.util.ArrayList;
import java.util.List;

public class Main612 {

	public static void main(String[] args) {
		// Integer 型で ArrayList を宣言
		// <ジェネリクス> .. クラス型を指定する(基本データ型は使えない)
		// 基本データ型はラッパークラスで指定する P611
		
		// ArrayList<Integer> points = new ArrayList<Integer>();
		// 左辺のArrayList はざっくり List<>(インターフェース)なので 左辺は List<>にすることが多い。
		List<Integer> points = new ArrayList<>();
		System.out.println("size:" + points.size());
		
		// .add()メソッドでList内に追加していく。
		// オートボクシング AutoBoxing
		// 	--> 10(int型)を自動的に10(Integer型)に変換・格納
		
		points.add(10);
		points.add(80);
		points.add(75);
	
		// 拡張for文 : 利用可能
		// オートアンボクシング AutoUnBoxing
		// 	--> 10(Integer型)を自動的に10(int型)に変換
		for (int i : points) {
			System.out.println(i);
		}
		System.out.println("size : " + points.size());
		System.out.println("0番目表示 get() : " + points.get(0));
		System.out.println("0番目削除 remove() : " + points.remove(0));
		
		// for文の書き方
		for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}
		
		// coutains(val) : valが含まれているかどうか
		if (points.contains(80)) {
			System.out.println("ある");
		}
		
	}

}
