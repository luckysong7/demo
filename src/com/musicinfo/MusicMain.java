package com.musicinfo;

public class MusicMain {
	public static void main(String[] args) {
		Music obj1 = new MusicImpl();
		obj1.set(); // 인원 입력
		obj1.input(); // 정보 입력
		obj1.print(); // 결과 출력 
	}
	
}
