package com.day5;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		// 10 �� �̳��� �̸��� ������ �Է¹޾�
		// �������ϱ�
		int num;
		int temp;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �Է� :");
		num = sc.nextInt();
		
		//�迭 ����
		String[] arr_name = new String[num];
		int[] arr_score = new int[num];
		int[] arr_rank = new int[num];
		
		for(int i = 0 ; i < num ;i++){
			arr_rank[i] = 1;
		}
		
		//�̸��� ���� �Է¹ޱ�
		for(int i = 0 ; i < num ; i++){
			System.out.print("�л��̸� �Է� :" );
			arr_name[i] = sc.next();
			System.out.print("���� �Է� :" );
			arr_score[i] = sc.nextInt();
		}
		
		//�������ϱ�
		for(int i = 0 ; i < (num-1) ; i++){
			for(int j = i+1 ; j < num ; j++){
				if(arr_score[j] < arr_score[i]){
					arr_rank[j]++; 
				}else if(arr_score[j] > arr_score[i]){
					arr_rank[i]++;
				}else{
					continue;
				}
			}
		}
		
		
		//���
//		for(String k : arr_name){
//			System.out.print(k + " ");
//		}
//		for(int k : arr_score){
//			System.out.print(k+ " ");
//		}
//		for(int k : arr_rank){
//			System.out.print(k+ " ");
//		}
		for(int i = 0 ; i < num ; i++){
			
			System.out.print(arr_name[i]+ " ");
			System.out.print(arr_score[i]+ " ");
			System.out.println(arr_rank[i]);
		}
		
	}
}
