package Chap05;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		System.out.println("何の計算をしますか？");
		System.out.print("0:足し算 1:引き算 2:掛け算 3:割り算 > ");
		int calcNum = new java.util.Scanner(System.in).nextInt();
		switch (calcNum) {
		case 0:
			calcPlus();
			break;
		case 1:
			calcMinus();
			break;
		case 2:
			calcMulti();
			break;
		case 3:
			calcDiv();
			break;
		}

	}
	
	public static void calcPlus() {
		System.out.print("何個足し算しますか？ >");
		// ユーザ入力読み込みオブジェクトを生成 
	    Scanner scanner = new Scanner(System.in); 
	    int inputNum = scanner.nextInt();
	    double[] nums = null;
	    double sum = 0;
		
	    for(int i=0; i<inputNum; i++) {
	    	System.out.print("足し算する" + (i+1) + "つ目の数字を入力してください >");
	    	nums[i] = new Scanner(System.in).nextDouble();
	    }
	    
	    for (double val : nums) {
	    	sum += val;
	    	System.out.print(sum);
	    }
		
		// System.out.print("足し算する2つ目の数字を入力してください >");
		// double y = new java.util.Scanner(System.in).nextDouble();
		// System.out.print(x + "+" + y + "=" + (x+y));
		
	}
	
	public static void calcMinus() {
		System.out.print("引き算する1つ目の数字を入力してください >");
		double x = new java.util.Scanner(System.in).nextDouble();
		System.out.print("引き算する2つ目の数字を入力してください >");
		double y = new java.util.Scanner(System.in).nextDouble();
		System.out.print(x + "-" + y + "=" + (x-y));
	}
	
	public static void calcMulti() {
		System.out.print("掛け算する1つ目の数字を入力してください >");
		double x = new java.util.Scanner(System.in).nextDouble();
		System.out.print("掛け算する2つ目の数字を入力してください >");
		double y = new java.util.Scanner(System.in).nextDouble();
		System.out.print(x + "×" + y + "=" + (x*y));
	}
	
	public static void calcDiv() {
		System.out.print("割られる数を入力してください >");
		double x = new java.util.Scanner(System.in).nextDouble();
		System.out.print("割る数を入力してください >");
		double y = new java.util.Scanner(System.in).nextDouble();
		System.out.print(x + "÷" + y + "=" + (x/y));
	}

}
