package v3;

// 抽象(abstract)クラス
public abstract class Player {
	private String name;
	private int hand;
	private String result;
	// 次の手を決める戦略の型(インターフェースの型に入れる) .. 多態性
	// 実際には、newされた RandomNextHand か、InputNextHandが入る
	private NextHand nextHand;
	
	// コンストラクタ
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	String[] hands = {"グー", "チョキ", "パー"};
	// メソッド toString()
	// toString()のオーバーライド
	public String toString() {
		return this.name + " : " + this.hands[this.hand] + " : " + this.result;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHand() {
		return hand;
	}
	
	// 引き数：なし
	public void setHand() {
		this.hand = this.nextHand.decideHand();
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public NextHand getNextHand() {
		return nextHand;
	}

	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}
}
