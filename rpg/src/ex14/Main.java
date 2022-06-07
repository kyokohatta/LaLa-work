package ex14;

import world.Hero;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		Account b = new Account();
		b.accountNumber = "  4649  ";
		b.balance = 666;
		
		if (a.equals(b)) {
			System.out.println("同じ口座番号です。");
		} else {
			System.out.println("違う口座番号です。");
		}
		
		Hero h = new Hero();
		if (a.equals(h)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
	}
	
}
