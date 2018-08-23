package com.score1;

import java.util.Scanner;

public class Score {

	int inwon;
	Record[] rec; // Ŭ������ �ʱⰪ�� ������ 0
	String[] title = {"���� ", "���� ", "���� "};
	Scanner sc = new Scanner(System.in);

	// �ο��� �Է¹ޱ�
	public void set() {

		do {
			System.out.print("�ο���?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon]; // �迭�� ��ü���� (�޸��Ҵ�)

	}

	// ���� �Է� �ޱ�
	public void input() {
		

		for (int i = 0; i < inwon; i++) {
			rec[i] = new Record();
			System.out.print((i + 1) + "��° �̸� ? ");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt(); // ������ ���� �ޱ�
				rec[i].tot += rec[i].score[j]; // ������ ���ϱ�
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}
	
	// ���� ���
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
	
	
	// ���� ���	
	public void printout(){
		
		ranking();
		
		for(int i = 0 ; i < inwon ; i++){
			System.out.printf("%6s�л� >> ", rec[i].name);
			for(int j = 0 ; j < 3 ; j++){
				System.out.printf("%4s :  %4d" , title[j] , rec[i].score[j]);
				
			}
			System.out.printf("\n�հ� : %4d", rec[i].tot);
			System.out.printf("\n��� : %4d", rec[i].avg);
			System.out.printf("\n���� : %4d", rec[i].rank);
			System.out.println();
			System.out.println("----------------------------------------------------");
		}
		
	}

}
