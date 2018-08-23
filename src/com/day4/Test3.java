package com.day4;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		//만년달력
		Scanner sc = new Scanner(System.in);
		
		//월별 날짜수를 배열저장
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y,m,nalsu,i,week;
		
		do{
			System.out.println("년도 ? ");
			y = sc.nextInt();
		}while(y<1);
		
		do{
			System.out.println("월 ? ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ){
			months[1]= 29;
		}
		
		//1년1월1일부터 전년도(y-1) 12월 31일까지의 날수
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//전월
		for(i = 0 ; i < m-1 ; i++){
		
			nalsu += months[i];
			
		}
		
		//y년 m월 d일까지의 날수
		
		nalsu = nalsu +1;
		
		//주의수 계산
		
		week = nalsu % 7 ;
		
//		System.out.println(week);
		System.out.print("----------------------------- ");
		System.out.println("\n  일  월  화  수  목  금  토 ");
		
		// 특정 요일 부터 시작하도록 공백을 지정
		
		for(i = 0 ; i < week ; i++){
			System.out.print("    "); // 4바이트 공백 4칸
		}
		
		// 해당 월의 날짜를 출력 
		
		for(i = 1 ; i <= months[m-1]; i++){
			System.out.printf("%4d",i);
			week++;
			if(week % 7 == 0 ){
				System.out.println();
			}			
		}
		if(week % 7 != 0){
			System.out.println();
		}
			
	}
	
}
