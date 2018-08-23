package com.day8;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		int key ;
//		int input[] = new int[10];
		String input = "";
		int count =0;
		System.out.println("숫자 입력");
	
//		for(int i = 0 ; i < input.length ; i++){
//			input[i] = System.in.read();
//			count ++;
//			if((key = System.in.read()) == 13 || (key = System.in.read()) == 10){
//				break;
//			}
//			
//		}
		while((key = System.in.read()) != 13){
			input += Character.toString((char)key);
		}
		int number = Integer.parseInt(input);
		System.out.println(input);
		System.out.println(number);
	}
}
