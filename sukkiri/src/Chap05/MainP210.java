package Chap05;

// P210 ～　値渡しと、参照の値渡し
public class MainP210 {

	public static void main(String[] args) {
		// 値渡し
		int x = 100;
		methodA(x);
		System.out.println("main x: " + x);
		
		// 参照渡し
		int[] y = {100, 200, 300};
		methodB(y);
		System.out.print("main y: ");
		for (int val : y) {
			System.out.print(val + " ");
		}
		
	}
	
	public static void methodA(int x) {
		x++;
		System.out.println("methodA: " + x);
	}
	
	public static void methodB(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
			
		System.out.print("methodB: ");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println(" ");
	}

}
