package ex;

public class Main4 {
	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		
		for(int i=0; i<moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		System.out.println(" ");
		
		for (int val : moneyList) {
			System.out.println(val);
		}
		// NullPointerException
		// ArrayIndexOutOfBoundsException
		
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int m : numbers) {
			if(m == input) {
				System.out.println("アタリ");
			} 
		}
		
	}

}
