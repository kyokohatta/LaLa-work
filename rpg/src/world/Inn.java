package world;

public class Inn {
	public void checkIn(Hero_chap13 h) {
		
		System.out.println(h.getName() + "は、宿屋で眠ってhpを回復した。");
		// h.hp = 100; の、代わりに、h.sleep()を呼び出す
		h.sleep();
	}
}
