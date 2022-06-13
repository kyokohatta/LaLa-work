package chap17;

// P686

public class Person {
	int age;
	public void setAge(int age) {
		if (age < 0) {  // ここで引数をcheck!
			throw new IllegalArgumentException
				("\n年齢は0以上の数を指定すべきです。指定値=" + age);
		}
		this.age = age;  // 問題ないなら、フィールドに値をセット
	}
	
}
