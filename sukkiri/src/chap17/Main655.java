package chap17;

import java.io.FileWriter; // ファイルに書き込むためのAPI
import java.io.IOException;

public class Main655 {

	public static void main(String[] args) {
		// P655 try-catch文 | try-catch-finally文
		// 今回 data.txt を「読み取り専用」にして、エラーをわざと起こしている。

		String txt = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter("data.txt");
			fw.write(txt);
		} catch (IOException | NullPointerException e) {
			// 書き込みできるかのcheck | 書き込んだ値がnullかどうかcheck
			// e.printStackTrace();
			System.out.println("エラーメッセージ" + e.getMessage());
			System.out.println("書き込み失敗('・ω・`)");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					; // close失敗時なにもしない時「；」だけ書く。
						// e.printStackTrace();
				}
			}
		}

	}

}
