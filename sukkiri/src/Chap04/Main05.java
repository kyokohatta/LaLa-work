// P164 参照渡し

package Chap04;

import java.util.Arrays;

public class Main05 {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3}; // = new int[3]{1, 2, 3} の略式。
		int[] arrayB = {3, 4, 5};
		arrayB = arrayA; // arrayAの要素のアドレスが代入される！
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		System.out.println(arrayA);
		System.out.println(Arrays.toString(arrayB));

	}

}
