package chap16;

import java.util.ArrayList;
import java.util.List;

import chap16.ex.User;

public class Main639 {

	public static void main(String[] args) {
		
		User h = new User();
		// 名前を決める
		h.setName("ミナト");
		// list に h を入れる
		List<User> list = new ArrayList<>();
		list.add(h);
		// 名前を書き換える
		h.setName("スガワラ");
		list.get(0).setName("アサカ");
		
		System.out.println(list.get(0).getName());
		System.out.println(h.getName());

	}

}
