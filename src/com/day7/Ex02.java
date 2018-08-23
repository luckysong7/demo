package com.day7;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
	String meter ="";
	int num = 0 ; 
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("미터 입력하시오 ");
	meter = sc.next(); // 30m
	
	num = Integer.parseInt(meter.substring(0, 2));
	
	System.out.println(num); // 30 숫자만
	}
	
}

// 30m 