package com.day5;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 10 �� �̳��� �̸��� ������ �Է¹޾�
		// ������ ���� ������� ���� ������� ��� (��������)
		// ���� �迭
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("10���� �̸��� ������ �Է� ");
		
		String[] name;
		int[] score;

		int i , j , temp;
		int inwon ;
		String temp2;
		
		int index_Min;
		
	
		do{
			System.out.print("�Է� ���� �ο��� (1 ~ 10)");
			inwon = sc.nextInt();
		}while(inwon < 1 || inwon > 10);
		
		// �迭�� �޸� �Ҵ�(��ü����)
		name = new String[inwon];
		score = new int[inwon];
		int[] rank = new int[inwon];
		
		//�ο��� ��ŭ �̸��� ������ �Է� 
		for(i  = 0 ; i < name.length ; i++){
			System.out.print((i+1)+ "�� �л� �̸� ?");
			name[i] = sc.next();
			
			System.out.print((i+1)+ "�� �л� ���� ?");
			score[i] = sc.nextInt();
			
		}
		
		for(i = 0 ; i < inwon ; i++){
			rank[i] = (i+1);
		}
		
		
		// ����
		
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
		
		// ���
		for(int a = 0 ; a < inwon ; a++){
			System.out.printf("%10s %4d %4d",name[a], score[a], rank[a]);
		}
		
		
	}
}
