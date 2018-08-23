package com.day5;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 10 명 이내의 이름과 점수를 입력받아
		// 점수가 높은 사람에서 낮은 사람으로 출력 (내림차순)
		// 이중 배열
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("10명의 이름과 점수를 입력 ");
		
		String[] name;
		int[] score;

		int i , j , temp;
		int inwon ;
		String temp2;
		
		int index_Min;
		
	
		do{
			System.out.print("입력 받을 인원수 (1 ~ 10)");
			inwon = sc.nextInt();
		}while(inwon < 1 || inwon > 10);
		
		// 배열의 메모리 할당(객체생성)
		name = new String[inwon];
		score = new int[inwon];
		int[] rank = new int[inwon];
		
		//인원수 만큼 이름과 점수를 입력 
		for(i  = 0 ; i < name.length ; i++){
			System.out.print((i+1)+ "번 학생 이름 ?");
			name[i] = sc.next();
			
			System.out.print((i+1)+ "번 학생 성적 ?");
			score[i] = sc.nextInt();
			
		}
		
		for(i = 0 ; i < inwon ; i++){
			rank[i] = (i+1);
		}
		
		
		// 연산
		
		for(i = 0 ; i < score.length-1 ; i++){
			index_Min = i;
			for(j = i+1 ; j < score.length; j++){
				if(score[index_Min] < score[j]){
					index_Min = j;
				}
			}
			temp = score[index_Min];
			score[index_Min] = score[i];
			score[i] = temp;
			temp2 = name[index_Min];
			name[index_Min] = name[i];
			name[i] = temp2;
		}
		
		// 출력
		for(int a = 0 ; a < inwon ; a++){
			System.out.printf("%10s %4d %4d",name[a], score[a], rank[a]);
		}
		
		
	}
}
