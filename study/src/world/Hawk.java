package world;

public class Hawk extends Animal {
	
	// コンストラクタ設定（親コンストラクタを呼び出す）
	public Hawk() {
		super("鷹");
	}
	
	// オーバーライド（子クラスで上書き）
	public void go() {
		if(this.life = true) {
		System.out.println(this.name + "は、大空を飛んだ。");
		hp5Minus();
		// 親のメソッドのgo()を呼び出す
		super.go();
		dead();
		}
	}
}
