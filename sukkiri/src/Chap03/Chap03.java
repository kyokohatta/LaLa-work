package Chap03;
public class Chap03 {
    public static void main(String[] args) {

        // P.119 if 文を switch 文に書き換え
        // 文字列の比較は
        System.out.println("あなたの運勢を占います。");
        int fortune = new java.util.Random().nextInt(4) + 1;
        switch(fortune) {
            case 1: // ← ここはコロン (:)!!!
                System.out.println("大吉");
                break;
            case 2: // ← ここはコロン (:)!!!
                System.out.println("中吉");
                break;
            case 3: // ← ここはコロン (:)!!!
                System.out.println("吉");
                break;
            default:
                System.out.println("凶"); // default は、break; いらない！
        }

        // P130 ループ変数を初期化しない for 文
        int i = 3;
        for (; i<10; i++) {
            System.out.println("今は" + i);
        }

        // P131 九九
        for (int j=1; j<10; j++) {
            for(int k=1; k<10; k++) {
                System.out.print(j * k);
                System.out.print(" ");  // 空白の出力
            }
            System.out.println(j + "行目");  // 改行の出力
        }
    }
}