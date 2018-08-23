package com.day10;

public class Test4 {
	// StringBuffer
	// StringBuilder
	
	public void stringTime() {

		System.out.println("StringTime...");

//		long start1 = System.currentTimeMillis(); // 밀리세컨
		long start2 = System.nanoTime(); // 10^(-9)

		String str2 = "";

		for (int i = 1; i <= 50000; i++) {
			str2 += "a";
		}

//		long end1 = System.currentTimeMillis();
		long end2 = System.nanoTime();

		System.out.println("실행시간 : " + (end2 - start2) + "초");
	}
	

	public void stringBufferTime() {

		System.out.println("StringBufferTime...");

//		long start1 = System.currentTimeMillis(); // 밀리세컨
		long start2 = System.nanoTime(); // 10^(-9)

		StringBuffer str = new StringBuffer("a");

		for (int i = 1; i <= 50000; i++) {
			str.append("a");
		}

//		long end1 = System.currentTimeMillis();
		long end2 = System.nanoTime();

		System.out.println("실행시간 : " + (end2 - start2) + "초");
	}
	
	public void stringBuilderTime() {

		System.out.println("StringBuilderTime...");

//		long start1 = System.currentTimeMillis(); // 밀리세컨
		long start2 = System.nanoTime(); // 10^(-9)

		StringBuilder str = new StringBuilder("a");

		for (int i = 1; i <= 50000; i++) {
			str.append("a");
		}

//		long end1 = System.currentTimeMillis();
		long end2 = System.nanoTime();

		System.out.println("실행시간 : " + (end2 - start2) + "초");
	}

	public static void main(String[] args) {
		Test4 ob = new Test4();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();

	}
}
