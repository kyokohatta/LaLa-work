package v3;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	// 次の手を決める戦略の型(インターフェースの型に入れる) .. 多態性
	private NextHand nextHand;
	
	// コンストラクタ
	public Player(NextHand nextHand) {
		this.nextHand = nextHand;
	}
	
	// メソッド toString()
	// toString()のオーバーライド
	public String toString() {
		return this.name + " : " + this.hand + " : " + this.result;
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

	public void setHand() {
		this.hand = nextHand.decideHand();
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
