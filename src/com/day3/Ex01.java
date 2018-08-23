package com.day3;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		Date date = now.getTime();
		System.out.println(date);
		
		now.add(Calendar.HOUR, 6);
		
		System.out.println(now.getTime());
		
		int[][] arr = new int[5][10]	;
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}
}
