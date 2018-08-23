package com.day11.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Calendar 를 사용하여 만년달력을 만들기
		Calendar now = Calendar.getInstance();

		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH) + 1;
		now.set(Calendar.DATE,1);
		int w = now.get(Calendar.DAY_OF_WEEK);
		
		
		int endDate = now.getActualMaximum(Calendar.DATE);
		
//		System.out.println(w);
//	
//		System.out.println(endDate);
//		System.out.printf("%tF", now);
		System.out.println();

	
		
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		System.out.println("**** 만년 달력 프로그램 ****");

		// 달력 출력
		System.out.println("\n  일  월  화  수  목  금  토 ");
		System.out.println("----------------------------- ");
		for (int i = 1; i < w; i++) {
			System.out.print("    "); // 4바이트 공백 4칸
		}
		for(int i = 1 ; i <= endDate ; i++){
			System.out.printf("%4d",i);
			
			if(w % 7 == 0){
				System.out.println();
			}
			w++;
		}
		
	}
}
