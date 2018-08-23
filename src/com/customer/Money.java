package com.customer;

import java.util.Scanner;

public class Money {
	Scanner sc = new Scanner(System.in); // 스캐너

	int num = 0 ; //인원수 담을 변수
	Record[] rec ; // 고객 인스턴스 배열
	
	String[] catalog = {"구매금액", "포인트"};
	
	// 인원수 입력받기
	public void set(){
		
		do{
			System.out.print("인원수 입력 >> ");
			num = sc.nextInt(); //인원수 입력
			
		}while(num < 1 || num > 11);
	
		// 배열 생성
		rec = new Record[num];
		
	}
	
	// 고객이름, 구매금액 입력받기
	
	public void input(){
		
		for(int i = 0 ; i < num ; i++){
			rec[i] = new Record(); // 각각의 배열에 객체 생성
			System.out.println((i+1)+"번째 고객의 이름 ?");
			rec[i].name = sc.next();
			for(int j = 0 ; j < 2 ; j++){
				System.out.print((i+1) + "번째 고객의 " + catalog[j] +"?");
				rec[i].money_Bought_And_Point[j] = sc.nextInt();
				
				//고객의 구매금액과 포인트의 합계
				rec[i].tot = rec[i].money_Bought_And_Point[j];
				System.out.println();
			}
		}
	}
	
	// 우수 고객 선정하기
	
	private void ranking(){ 
		
		for(int i = 0 ; i < num ; i++){
			rec[i].rank = 1;
		}
		
		for(int i = 0 ; i < num-1 ; i ++){
			for(int j = i+1 ; j < num ; j++){
				if(rec[i].rank < rec[j].rank){
					rec[i].rank++ ;
				}else{
					rec[j].rank++ ;
				}
			}
		}
	}
	
	// 결과 출력하기
	
	public void printout(){
		ranking();
		
		for(int i = 0 ; i < num ; i ++){
			System.out.println("************************************");
			System.out.printf("%4s의 구매금액 : %3d 포인트 금액 : %3d"
					+ "    총 합계 : %3d 순위 : %3d\n", rec[i].name, 
					rec[i].money_Bought_And_Point[0], rec[i].money_Bought_And_Point[1],
					rec[i].tot, rec[i].rank);
		}
	}
	
}
