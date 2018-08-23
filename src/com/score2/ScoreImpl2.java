package com.score2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl2 implements Score2 {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>();  // ��ĳ��Ʈ�� �� ���� ������ // List�� ���ɾ ���� 

	@Override
	public int input() {

		int result = 0; // DB ��ﶧ �Է� ���� ���� ����

		Scanner sc = new Scanner(System.in);

		ScoreVO vo = new ScoreVO(); // input�Լ��� 10�� ����Ǹ� vo ��ü�� 10 �� ���������.

		System.out.print("�й� ? ");
		vo.setHak(sc.next());

		System.out.print("�̸� ? ");
		vo.setName(sc.next());

		System.out.print("���� ? ");
		vo.setKor(sc.nextInt());

		System.out.print("���� ? ");
		vo.setEng(sc.nextInt());

		System.out.print("���� ? ");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return 0;
	}

	@Override
	public void print() {

		System.out.printf("%2s %4s %s %s %s %s %s \n", "�й�","�̸�","����","����","����","����","���");
		System.out.println("------------------------------------------");
		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}
	
	public void descSortTot() {
		// Comparator ��� �������̽�
		// �ٷ� �������̵� �ϵ��� ������

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