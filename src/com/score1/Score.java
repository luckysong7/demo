package com.score1;

import java.util.Scanner;

public class Score {

	int inwon;
	Record[] rec; // 클래스의 초기값은 무조건 0
	String[] title = {"국어 ", "수학 ", "영어 "};
	Scanner sc = new Scanner(System.in);

	// 인원수 입력받기
	public void set() {

		do {
			System.out.print("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon]; // 배열의 객체생성 (메모리할당)

	}

	// 점수 입력 받기
	public void input() {
		

		for (int i = 0; i < inwon; i++) {
			rec[i] = new Record();
			System.out.print((i + 1) + "번째 이름 ? ");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt(); // 국영수 점수 받기
				rec[i].tot += rec[i].score[j]; // 총점수 더하기
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}
	
	// 석차 계산
	private void ranking(){
		int i , j ; 
		
		for(i = 0 ; i < inwon ; i++){
			rec[i].rank = 1;
		}
		
		for(i = 0 ; i < inwon-1 ; i++){
			for( j = i+1 ; j < inwon ; j++){
				if(rec[i].tot < rec[j].tot){
					rec[i].rank += 1;
				}else{
					rec[j].rank += 1;
				}
			}
		}
	}
	
	
	// 성적 출력	
	public void printout(){
		
		ranking();
		
		for(int i = 0 ; i < inwon ; i++){
			System.out.printf("%6s학생 >> ", rec[i].name);
			for(int j = 0 ; j < 3 ; j++){
				System.out.printf("%4s :  %4d" , title[j] , rec[i].score[j]);
				
			}
			System.out.printf("\n합계 : %4d", rec[i].tot);
			System.out.printf("\n평균 : %4d", rec[i].avg);
			System.out.printf("\n석차 : %4d", rec[i].rank);
			System.out.println();
			System.out.println("----------------------------------------------------");
		}
		
	}

}
