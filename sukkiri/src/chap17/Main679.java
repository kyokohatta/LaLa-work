package chap17;

import java.io.FileWriter;

public class Main679 {

	public static void main(String[] args) {
		
		// P679 try-with-resources文
		
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("エラーだぉ('・ω・`)");
		}

	}

}
