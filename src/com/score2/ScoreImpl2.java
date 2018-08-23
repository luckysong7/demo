package com.score2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl2 implements Score2 {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>();  // 업캐스트가 더 높은 언어수준 // List의 명령어를 쓴다 

	@Override
	public int input() {

		int result = 0; // DB 배울때 입력 성공 여부 리턴

		Scanner sc = new Scanner(System.in);

		ScoreVO vo = new ScoreVO(); // input함수가 10번 수행되면 vo 객체도 10 번 만들어진다.

		System.out.print("학번 ? ");
		vo.setHak(sc.next());

		System.out.print("이름 ? ");
		vo.setName(sc.next());

		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());

		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());

		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return 0;
	}

	@Override
	public void print() {

		System.out.printf("%2s %4s %s %s %s %s %s \n", "학번","이름","국어","영어","수학","총점","평균");
		System.out.println("------------------------------------------");
		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	
	public void descSortTot() {
		// Comparator 라는 인터페이스
		// 바로 오버라이드 하도록 생성됨

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getTot() < o2.getTot() ? 1 : -1;
			}
		};
		
		Collections.sort(lists,comp);
		
		print();
	}


	@Override
	public void ascSortAhk() {
		Comparator<ScoreVO> comp2 = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return Integer.parseInt(o1.getHak()) > Integer.parseInt(o2.getHak()) ? 1 : -1;
			}
		};
		
		Collections.sort(lists,comp2);
		print();
		
	}

	@Override
	public void searchHak() {
	}

	@Override
	public void searchName() {
	}

}
