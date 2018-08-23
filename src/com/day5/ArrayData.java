package com.day5;

import java.util.Scanner;

public class ArrayData {

	private Scanner sc = new Scanner(System.in);

	public int setLength() {
		int arrLength = sc.nextInt();

		return arrLength;
	}
	
	public int setData(){
		int arrData = (int)(Math.random()*10);
		
		return arrData;
	}
}
