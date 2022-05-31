package main;


//オーバーライドを練習

import world.Dog;
import world.Hawk;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		// dog.name = "犬";
		dog.eat();
		dog.go();
		dog.bark();
		dog.showHp();
		dog.bark();
		dog.bark();
		dog.bark();
		dog.bark();
		
		Hawk hawk = new Hawk();
		// hawk.name = "鷹";
		hawk.go();
		hawk.eat();
		hawk.go();
		hawk.go();
		hawk.go();
		hawk.go();
		hawk.showHp();
	

	}

}
