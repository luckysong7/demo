package com.customer;

import java.util.Scanner;

public class Money {
	Scanner sc = new Scanner(System.in); // ��ĳ��

	int num = 0 ; //�ο��� ���� ����
	Record[] rec ; // �� �ν��Ͻ� �迭
	
	String[] catalog = {"���űݾ�", "����Ʈ"};
	
	// �ο��� �Է¹ޱ�
	public void set(){
		
		do{
			System.out.print("�ο��� �Է� >> ");
			num = sc.nextInt(); //�ο��� �Է�
			
		}while(num < 1 || num > 11);
	
		// �迭 ����
		rec = new Record[num];
		
	}
	
	// ���̸�, ���űݾ� �Է¹ޱ�
	
	public void input(){
		
		for(int i = 0 ; i < num ; i++){
			rec[i] = new Record(); // ������ �迭�� ��ü ����
			System.out.println((i+1)+"��° ���� �̸� ?");
			rec[i].name = sc.next();
			for(int j = 0 ; j < 2 ; j++){
				System.out.print((i+1) + "��° ���� " + catalog[j] +"?");
				rec[i].money_Bought_And_Point[j] = sc.nextInt();
				
				//���� ���űݾװ� ����Ʈ�� �հ�
				rec[i].tot = rec[i].money_Bought_And_Point[j];
				System.out.println();
			}
		}
	}
	
	// ��� �� �����ϱ�
	
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
	
	// ��� ����ϱ�
	
	public void printout(){
		ranking();
		
		for(int i = 0 ; i < num ; i ++){
			System.out.println("************************************");
			System.out.printf("%4s�� ���űݾ� : %3d ����Ʈ �ݾ� : %3d"
					+ "    �� �հ� : %3d ���� : %3d\n", rec[i].name, 
					rec[i].money_Bought_And_Point[0], rec[i].money_Bought_And_Point[1],
					rec[i].tot, rec[i].rank);
		}
	}
	
}
