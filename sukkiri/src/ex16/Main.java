package ex16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// P643 練習問題16-1
		// 1) 日本の都道府県名（順序は不問）→ Set
		Set<String> prefs = new HashSet<>();
		prefs.add("大阪府");
		
		// 2) ５人の生徒のテストの点数→ List
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "みなと", 50));
		
		// 3) 過去の総理大臣の名前と任期→ Map
		Map<String, Integer> lists = new HashMap<>();
		lists.put("阿部晋三", 5);
		lists.put("吉田茂", 6);
		
		// 練習問題16-2
		List<Hero> heros = new ArrayList<>();
		Hero h1 = new Hero("斎藤");
		heros.add(h1);
		Hero h2 = new Hero("鈴木");
		heros.add(h2);
		
		for (Hero h : heros) {
			System.out.println(h.getName());
		}
		
		
		// 練習問題16-3
		Map<Hero, Integer> heros2 = new HashMap<>();
		heros2.put(h1, 3);
		heros2.put(h2, 7);
		
		for (Hero key : heros2.keySet()) {
			Integer val = heros2.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + val);
		}
		
		
	}

}

//練習問題16-1 (2)
class Student {
	int id;
	String name;
	int seiseki;
	
	public Student(int id, String name, int seiseki) {
		this.id = id;
		this.name = name;
		this.seiseki = seiseki;
	}
}

//練習問題16-2
class Hero {
	private String name;
	public Hero(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
