package com.day4;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
		
		System.out.println("int-> 문자열 2진수 : " + bin);
		System.out.println("int-> 문자열 8진수 : " + oct);
		System.out.println("int-> 문자열 16진수 : " + hex);
	}

}
