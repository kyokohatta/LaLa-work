package chap16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main629 {

	public static void main(String[] args) {
		
		// HashSet() .. 複数の情報を重複なく格納する集合(Set)。順番は問わない。
		System.out.println(">> HashSet ");
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤"); // ←重複しているから無視される
		System.out.println("色は" + colors.size() + "種類");
		
		for (String color : colors) {
			System.out.println(color); // 格納した順序で取り出せる保証なし
		}
		
		System.out.println(" ");
		
		// TreeSet() .. 自然順序付けで整列
		System.out.println(">> TreeSet ");
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		
		for (String word : words) {
			System.out.print(word + " → "); // ABC順で出力される
		}
		
	}

}
