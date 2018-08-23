package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl2 implements Score2 {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>(); // 업캐스트가 더 높은 언어수준
															// // List의 명령어를 쓴다
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0; // DB 배울때 입력 성공 여부 리턴

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

		System.out.printf("%2s %4s %s %s %s %s %s \n", "학번", "이름", "국어", "영어",
				"수학", "총점", "평균");
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
				return o1.getTot() > o2.getTot() ? 1 : -1;
			}
		};

		Collections.sort(lists, comp);

		print();
	}

	@Override
	public void ascSortHak() {
		Comparator<ScoreVO> comp2 = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
//				return Integer.parseInt(o1.getHak()) > Integer.parseInt(o2
//						.getHak()) ? 1 : -1;
				return o1.getHak().compareTo(o2.getHak());
			}
		};

		Collections.sort(lists, comp2);
		print();

	}

	@Override
	public void searchHak() {
		String index_Hak;
		System.out.println("검색하고 싶은 학번을 입력해주세요 [XXXXX] ? ");
		index_Hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			if (vo.getHak().equals(index_Hak)) {
				System.out.println(index_Hak + "의 학번을 찾았습니다.");
				System.out.println(vo.toString());
				break;

			} else {
				System.out.println("학번이 존재하지 않습니다. ");
				break;
			}
		}
	}

	@Override
	public void searchName() {
		String index_Name;
		System.out.println("검색하고 싶은 학번을 입력해주세요 [XXXXX] ? ");
		index_Name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			if (vo.getHak().equals(index_Name)) {
				System.out.println(index_Name + "의 이름을 찾았습니다.");
				System.out.println(vo.toString());
				break;

			} else {
				System.out.println("해당하는 이름이 존재하지 않습니다. ");
				break;
			}
		}
	}

}
