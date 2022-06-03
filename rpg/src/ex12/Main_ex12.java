package ex12;

public class Main_ex12 {

	public static void main(String[] args) {
		System.out.println("練習問題12-2");
		System.out.print("（１）");
		X obj = new A();
		obj.a();
		
		System.out.print("\n（２）");
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();
		
		System.out.println("\n ");
		
		System.out.println("練習問題12-3");
		
		Y[] arr = new Y[2];
		arr[0] = new A();
		arr[1] = new B();
		
		for (Y item : arr) {
			item.b();
		}

	}

}
