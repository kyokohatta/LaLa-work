package Chap03;

// P137  練習問題 3-6

public class Ex3_6 {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);  // new java.util.Random() .. Random()というインスタンスを作る
        System.out.println("com:" + ans);
        for(int i = 0; i < 5; i++) {
            System.out.println("// " +  (i + 1) + " 回目の回答");
            System.out.println("0～9の数字を入力してください。");
            int num = new java.util.Scanner(System.in).nextInt(); // System.in .. キーボード入力
            if(ans == num) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います。");
            }
        }
        System.out.println("ゲームを終了します。");
    }
}