package com.day7;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
	String meter ="";
	int num = 0 ; 
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("���� �Է��Ͻÿ� ");
	meter = sc.next(); // 30m
	
	num = Integer.parseInt(meter.substring(0, 2));
	
	System.out.println(num); // 30 ���ڸ�
	}
	
}

// 30m 