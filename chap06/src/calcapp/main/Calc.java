// P225 計算機プログラム mainメソッド部分
// プログラムの実行は、jar ファイルを作成して行う。
/* --------- jar ファイルの作成
-----------------------------------------------------
(1) manifest.mf というファイルを作って、以下の内容とする。
    (※最後は改行コードを入れる必要がある)
    ---------------------
    Main-Class: Calc

    ---------------------

(2) 以下、コマンドで jarファイルを作成する。
    > jar cmvf manifest.mf calc.jar *.class

(3) 実行は、以下。
    > java -jar calc.jar

-----------------------------------------------------
*/

// pakage の設定(名前は小文字にするのが通例)
package calcapp.main;

// import 文 ( import パッケージ名.クラス名; )
import calcapp.logics.CalcLogic; // もしくは import calcapp.logics.*;

public class Calc {
    public static void main (String[] args) {
        int a = 10;
        int b = 2;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);
    }
}