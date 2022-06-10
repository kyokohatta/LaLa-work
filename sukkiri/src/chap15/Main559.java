package chap15;


public class Main559 {

	public static void main(String[] args) {
		
		// P558　文字列(String)の検索
		// .. webアプリで検索するときに使うことがある
		String s1 = "JavaScript and Java";
		if (s1.contains("Java")) {
			disp("> s1.contains(\"Java\")");
			disp("s1はJavaを含んでいます\n");
		}
		if (s1.startsWith("Java")) {
			disp("> s1.startsWith(\"Java\")");
			disp("文字列s1は、Javaが先頭にあります\n");
		}
		if (s1.endsWith("Java")) {
			disp("> s1.endsWith(\"Java\")");
			disp("文字列s1は、Javaが末尾にあります\n");
		}
		disp("> s1.indexOf(\"Java\")");
		disp("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java") + "\n");
		
		disp("> s1.lastIndexOf(\"Java\")");
		disp("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java") + "\n");
		
		
		// P560 文字列の切り出し
		String s2 = "Java programming";
		
		disp("> s2.substring(3)");
		disp("文字列s2の4文字目以降は、" + s2.substring(3) + "\n");
		
		disp("> s2.substring(3, 8)");
		disp("文字列s2の4～8文字目は、" + s2.substring(3, 8) + "\n");
		
		disp("> s2.replace(\"Java\", \"PHP\")");
		disp("Java programmingのJavaを\nPHPに変換：" + s2.replace("Java", "PHP"));

	}
	
	public static void disp(String s) {
		System.out.println(s);
	}

}
