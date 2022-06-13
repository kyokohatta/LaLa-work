package chap17.ex1;

public class Main01 {

	public static void main(String[] args) {
		Tool tool = new Tool();
		int num = tool.inputNum();
		System.out.println("数字：" + num + "\n");
		
		int num2 = tool.getNum();
		System.out.println("数字：" + num2);

	}

}
