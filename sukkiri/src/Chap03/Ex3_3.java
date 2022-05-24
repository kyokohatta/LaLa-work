package Chap03;

// P135  練習問題 3-3

public class Ex3_3 {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2) ; // 0 か 1 が入る。
        String food = "おでん";
        System.out.println("こんにちは");
        
        if (isHungry == 0) {
            System.out.println("お腹いっぱいです。");
        } else {
            System.out.println("はらぺこです。");
            System.out.println(food + "を、いただきます。");
        }
        // 三項演算子だったら if文 が 1 行 で書ける。
        String mes = (isHungry == 0) ? "お腹がいっぱいです" : "腹ペコです。" + food + "をいただきます。";
        System.out.println(mes);
        System.out.println("ごちそうさまでした。");
    }
}