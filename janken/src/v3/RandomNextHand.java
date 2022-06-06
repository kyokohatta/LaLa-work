package v3;

import java.util.Random;

public class RandomNextHand implements NextHand{

	@Override
	public int decideHand() {
		// 0 : グー　1：チョキ　2:パー
		int hand = new Random().nextInt(3);
		return hand;
	}
	
}
