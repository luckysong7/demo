package com.day6;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		//Class 
	    //Scanner sc = new Scanner(System.in); ->메모리 할당
		
		TestCom tc = new TestCom();
		tc.input();
		
		System.out.println();
		
		tc.print(tc.area(), tc.length());
		
		//-----------------------------------------------
		System.out.println("---------------------------------");
		System.out.println();
		tc.input();
		tc.print(tc.area(), tc.length());
	}
}
