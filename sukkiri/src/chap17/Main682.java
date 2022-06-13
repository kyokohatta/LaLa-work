package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main682 {

	public static void main(String[] args) {
		sub();

	}
	
	public static void sub() {
		try {
			subsub();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	// スロー宣言 .. もしもsubsub()でエラーが起こったら
	// 呼び出し元(ここではsub())に例外をスローする
	public static void subsub() throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("Hello!");
		fw.close();
	}

}
