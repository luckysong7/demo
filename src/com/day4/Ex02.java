package com.day4;

public class Ex02 {
	public static void main(String[] args) {
		String map ="";
		int SEATNUMBER = 50;
		int count =5 ;
		float percentage = ((float) count / (float)(SEATNUMBER)) * 100; 
		
		String str = String.format("[열람실 전체 좌석 : %d | 이용중인 좌석 : %d | 이용가능한 좌석 : %d | 이용률 : %.2f %% ]\n",
				SEATNUMBER, count, (SEATNUMBER - count), percentage);
		
		map += str;
		
		System.out.println(map);
	}
}
