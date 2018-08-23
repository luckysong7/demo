package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec;

	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	@Override
	public void input() {

		for (int i = 0; i < inwon; i++) {
			rec[i] = new Record();

			System.out.println("학번 ? ");
			rec[i].hak = sc.nextInt();

			System.out.println("이름 ? ");
			rec[i].name = sc.next();

			System.out.println("국어 ? ");
			rec[i].kor = sc.nextInt();
			System.out.println("수학 ? ");
			rec[i].math = sc.nextInt();
			System.out.println("영어 ? ");
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
			pan =  "수"; 
			break;
		case 8:
			pan =  "우";
			break;
		case 7:
			pan =  "미";
			break;
		case 6:
			pan =  "양";
			break;

		default:
			pan =  "가";
			break;
		}
		
		return pan;
	}

	@Override
	public void print() {
		for(int i  = 0 ; i < inwon ; i++){
			System.out.println("--------------------------");
			System.out.println("이름 : " + rec[i].name);
			System.out.println("학번 : " + rec[i].hak);
			System.out.println("국어점수 : " + rec[i].kor + "("+ panjung(rec[i].kor)+")");
			System.out.println("수학점수 : " + rec[i].math + "("+ panjung(rec[i].math)+")");
			System.out.println("영어점수 : " + rec[i].eng + "("+ panjung(rec[i].eng)+")");
			System.out.println("총합 : " + rec[i].tot + " 평균 : " + rec[i].avg);
			System.out.println("");
			
		}
		
	}

}
