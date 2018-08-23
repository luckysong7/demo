package com.day9;

// 비정형 인수

public class Test5 {
	
	public int sum(int...args){
		int s = 0 ; 
		for(int i = 0 ; i < args.length;i++){
			s += args[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
	
		int result;
		Test5 obj1 = new Test5();
		result = obj1.sum(2,4,6,8,10);
		
		System.out.println(result);
		
		result = obj1.sum(1,3,5,7,9,11,13,15,17,19);
		System.out.println(result);
		
	}
}
