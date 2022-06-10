package ex14;

public class Account {
	String accountNumber; // 口座番号
	int balance; // 残額
	
	// ① toString メソッドのオーバーライド
	public String toString() {
		return "￥" + this.balance +
				"(口座番号：" + this.accountNumber + ")";
	}
	
	// ② Objectクラスの equals() メソッドのオーバーライド
	// 前後に半角空白があっても取り除いて比較できるようにする .. trim()
	@Override
	public boolean equals(Object o) {
		// 参照アドレスが等しい場合(本来のObjectクラスの equals()メソッド) --> true
		if (this == o) {
			return true;
		}
		// 参照アドレスは異なるが、
		// 引数のオブジェクトがAccountクラスのインスタンスの場合 .. instanceof
		if (o instanceof Account) {
			Account a = (Account) o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
	
	// equals()をオーバライドしたら、hashCode()もオーバーライドする必要がある。
	// hashCode()で比較しているメソッドもあるので、equals()と一緒に変更する必要がある。
	@Override
	public int hashCode() {
		int result = accountNumber.hashCode();
		result = result * 31 + Integer.hashCode(balance);
		return result;
	}
	
	// オーバーロードはダメ！
	// public boolean equals(Account a) {
	// 	String a1 = this.accountNumber.trim();
	// 	if (a1.equals(a.accountNumber.trim())) {
	// 		return true;
	// 	}
	// 	return false;
	// }
}
