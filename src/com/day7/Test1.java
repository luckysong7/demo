package com.day7;

import com.day6.TestCom;


public class Test1 {
	
	public static void main(String[] args) {
	
		TestCom tc = new TestCom();
		
		tc.input();	
		tc.print(tc.area(), tc.length());
		
		//-----------------------------------------------
		
		System.out.println("---------------------------------");
		System.out.println();
		
		tc.input();
		tc.print(tc.area(), tc.length());
		
	}
}
