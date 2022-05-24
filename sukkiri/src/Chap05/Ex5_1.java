package Chap05;

public class Ex5_1 {

	public static void main(String[] args) {
		introduceOnself();
		System.out.println(" ");
		email("ごご", "aaaa@gmail.com", "ががが");
		email("bbb@mail.com", "がはは");
		double x = 5.0;
		double y = 3.0;
		double calcT = calcTriangleArea(x, y);
		System.out.println("三角形の底辺の長さが" + x + "cm、高さが" + y + "cmの場合、面積は、" + calcT + "㎠");
		double calcC = calcCircleArea(x);
		System.out.println("円の半径が" + x +  "cmの場合、円の面積は、" + calcC + "㎠");

	}

	public static void introduceOnself() {
		System.out.println("名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("身長を入力してください。");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.println("干支を入力してください。");
		String eto = new java.util.Scanner(System.in).nextLine();

		System.out.println("こんにちは！私の名前は、" + name + "です。");
		System.out.println("年齢は、" + age + "歳で、身長は、" + height + "cmです。");
		System.out.println("ちなみに干支は、" + eto + "です。");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = height * bottom / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
