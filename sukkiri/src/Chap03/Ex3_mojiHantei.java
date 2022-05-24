package Chap03;

// 1）文字を入力してもらう
// 2) その文字を str1 にいれてもらう
// 3) 文字をもう一つ入力してもらう
// 4) str2 に代入
// 5) str1 と str2 を比べて、等しいか違うか判定

public class Ex3_mojiHantei {
    public static void main(String[] args) {
        System.out.println("文字を1文字入力してください。");
        String str1 = new java.util.Scanner(System.in).nextLine();
        System.out.println("文字を１文字入力してください。");
        String str2 = new java.util.Scanner(System.in).nextLine();

        if (str1.equals(str2)) {
        // if (str1 == str2) { // これでは判定できないので注意！
            System.out.println("同じです。");
        } else {
            System.out.println("ちがいます。");
        }
    }
}