package ex;

public class Main5 {
	public static void main(String[] args) {
		introduceOneself();
		email("あ", "gmail.com", "あああああああ");
		email("gmail.com", "あああああああ");
	}
	
	public static void introduceOneself() {
		String name = "きょん";
		int age = 35;
		double height = 160;
		char eto = '虎';
		
		System.out.println(name + "は、" + age + "歳。" + height + "cmの、干支は" + eto);
		
	}
	
	public static void email(String title, String add, String text) {
		System.out.println(add + "に以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		
	}
	
	public static void email(String add, String text) {
		System.out.println(add + "に以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static double calcTArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}
	
}
