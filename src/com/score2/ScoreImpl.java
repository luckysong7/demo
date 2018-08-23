package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {

		do {
			System.out.println("�ο���?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	@Override
	public void input() {

		for (int i = 0; i < inwon; i++) {
			rec[i] = new Record();

			System.out.println("�й� ? ");
			rec[i].hak = sc.nextInt();

			System.out.println("�̸� ? ");
			rec[i].name = sc.next();

			System.out.println("���� ? ");
			rec[i].kor = sc.nextInt();
			System.out.println("���� ? ");
			rec[i].math = sc.nextInt();
			System.out.println("���� ? ");
			rec[i].eng = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].math;
			rec[i].avg = rec[i].tot / 3;

		}

	}

	private String panjung(int score) {
		String pan = "";
		
		switch (score / 10) {
		case 10:
		case 9:
			pan =  "��"; 
			break;
		case 8:
			pan =  "��";
			break;
		case 7:
			pan =  "��";
			break;
		case 6:
			pan =  "��";
			break;

		default:
			pan =  "��";
			break;
		}
		
		return pan;
	}

	@Override
	public void print() {
		for(int i  = 0 ; i < inwon ; i++){
			System.out.println("--------------------------");
			System.out.println("�̸� : " + rec[i].name);
			System.out.println("�й� : " + rec[i].hak);
			System.out.println("�������� : " + rec[i].kor + "("+ panjung(rec[i].kor)+")");
			System.out.println("�������� : " + rec[i].math + "("+ panjung(rec[i].math)+")");
			System.out.println("�������� : " + rec[i].eng + "("+ panjung(rec[i].eng)+")");
			System.out.println("���� : " + rec[i].tot + " ��� : " + rec[i].avg);
			System.out.println("");
			
		}
		
	}

}
