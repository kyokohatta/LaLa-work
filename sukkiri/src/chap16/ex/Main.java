package chap16.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("染谷将太", 29));
		userList.add(new User("二階堂ふみ", 27));
		userList.add(new User("窪塚洋介", 42));
		
		for (User user : userList) {
			System.out.println(user.getName() + ":" + user.getAge());
		}

	}

}
