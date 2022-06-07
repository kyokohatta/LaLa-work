package v3;

import java.util.Random;

public class CleverNextHand implements NextHand {
	private Player player;
	
	// コンストラクタ
	public CleverNextHand() {}
	
	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public int decideHand() {
		// 0 : グー　1：チョキ　2:パー
		int hand = -1;
		// player が設定されていない場合 .. 普通のランダム
		if (this.player == null) {
			return new Random().nextInt(3);
		}
		// result = "draw" --> (hand + 1) % 3 を出す
		// resule が null でなく、draw の場合
		if (this.player.getResult() != null &&
				this.player.getResult().equals("draw")) {
			hand = (this.player.getHand() + 1) % 3;
		} else {
			hand = new Random().nextInt(3);
		}
		return hand;
	}

}
