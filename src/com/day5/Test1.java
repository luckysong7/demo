package com.day5;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		// 선택 정렬 
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int i,j,temp;
		
		System.out.println("다섯개의 숫자 입력 : ");
		for(i = 0 ; i < num.length ; i++){
			num[i] = sc.nextInt();
		}
		
		System.out.print("Source Data : ");
		
		for(i = 0 ; i < num.length; i++){
			System.out.printf("%4d", num[i]);
		}
		System.out.println();
		
		for(i = 0 ; i < num.length-1 ; i++){
			for(j = i+1 ; j<num.length; j++){
				System.out.println(i + ":" + j);
				if(num[i] >= num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print("Sorted Data : ");
		
		for(int n : num){ // 확장 for문
			System.out.printf("%4d", n);
		}
	}
	
	public static int[] selectionSortAsc(int[] items){
		int minIndex ,temp ;
		
		for(int a =  0 ; a<items.length; a++){
//			minIndex = i ; 
			for(int b = 0 ; b < items.length ; b++){
//				if()
				
				
			}
		}
		
		return items;
		
	}
}
