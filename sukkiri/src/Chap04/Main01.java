// P158 点数管理プログラム（for文）

package Chap04;

public class Main01 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}

}