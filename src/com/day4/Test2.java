package com.day4;

public class Test2 {
	public static void main(String[] args) {
		
		// ¹è¿­
		int[] num = new int[5];
		
		for( int i = 0 ; i < num.length; i++){
			num[i] = (i+10);
		}
		for(int i= 0 ; i < num.length; i++){
			System.out.println(num[i]);
		}
		
	}
}
