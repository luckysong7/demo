package com.day4;

public class Ex02 {
	public static void main(String[] args) {
		String map ="";
		int SEATNUMBER = 50;
		int count =5 ;
		float percentage = ((float) count / (float)(SEATNUMBER)) * 100; 
		
		String str = String.format("[������ ��ü �¼� : %d | �̿����� �¼� : %d | �̿밡���� �¼� : %d | �̿�� : %.2f %% ]\n",
				SEATNUMBER, count, (SEATNUMBER - count), percentage);
		
		map += str;
		
		System.out.println(map);
	}
}
