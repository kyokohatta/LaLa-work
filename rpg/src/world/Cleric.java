package world;

import java.util.Random;

// P.330 練習問題8　フィールド --> P552 練習問題14-2にて変更

public class Cleric {
	// フィールド
	private String name;
	private int hp = 50;
	public static final int MAX_HP = 50; // 定数フィールド
	private int mp = 10;
	public static final int MAX_MP = 10; // 定数フィールド
	
	// メソッド
	// selfAid().. MPを5消費→最大HPまで回復
	public void selfAid() {
		System.out.println("聖職者" + this.name + "は、「セルフエイド」を唱えた。");
		this.mp -= 5;
		this.hp = this.MAX_HP;   // 定数は this 付けなくても別にいい。
		System.out.println( "HPが最大まで回復した。");
		System.out.println( "MPを5消費した。");
	}
	
	/**
	 * pray()
	 * 聖職者は祈ることで自分のMPを回復できる。
	 * 回復量は祈る秒数+ランダム(3未満)
	 * ただし、最大MPを越えることはない。
	 * @param sec int 祈る秒数
	 * @return mpKaihuku int 回復量
	 */
	public int pray(int sec) {
		System.out.println("聖職者" + this.name + "は、" + sec + "秒間天に祈った。");
		int mpKaihuku = sec + new Random().nextInt(3);
		int mpKaihukugo = mpKaihuku + this.mp;
		
		if(mpKaihukugo > MAX_MP) {
			mpKaihuku = MAX_MP - this.mp;
		}
		
		System.out.println("MPが" + mpKaihuku + "、回復した。");
		return mpKaihuku;
	
	}
	
	// getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	

}
