package com.day4;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
		
		System.out.println("int-> ���ڿ� 2���� : " + bin);
		System.out.println("int-> ���ڿ� 8���� : " + oct);
		System.out.println("int-> ���ڿ� 16���� : " + hex);
	}

}
