package com.day4;

public class HW4 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1 ; i <= 100; i++){
			if(i % 3 == 0){
				count ++;
				
			}
		}
		System.out.println("3의 배수의 개수 : " + count);
	}
}
