// P265 chap06 練習問題
import comment.Zenhan;

public class Main {
    public static void main (String[] args) throws Exception {
        Zenhan.doWarusa(); // import しているので、クラスの呼び出しに、FQCNを少し省略形で書ける。
        Zenhan.doTogame();
        comment.Kouhan.callDeae();  // import してないので、クラスの呼び出しには完全限定クラス名（FQCN)を書く。
        comment.Kouhan.showMondokoro();
    }

}