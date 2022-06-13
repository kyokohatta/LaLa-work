package chap17;

// P688

public class UnsupportedMisicFileException extends Exception {
	// エラーメッセージを受け取るコンストラクタ
	public UnsupportedMisicFileException(String msg) {
		super(msg);
	}
}