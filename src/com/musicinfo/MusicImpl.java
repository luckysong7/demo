package com.musicinfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

import com.score3.ScoreVO;

public class MusicImpl implements Music {

	Scanner sc = new Scanner(System.in);
	private int num; // �Է��� �뷡 ���� ���� ����
	// private Record[] musicArray; // Record��ü �ϳ��ϳ� ���� �迭
	private List<MusicVO> musicArray; // ��ĳ��Ʈ�� �� ���� ������

	// // List�� ��ɾ ����
	@Override
	public void set() {
		do {
			System.out.print("�Է��� �뷡 ���� ?");
			num = sc.nextInt();
		} while (num < 1 || num > 5); // 1 ~ 5������ �뷡������ ����

		musicArray = new ArrayList<MusicVO>(); // �޾ƿ� �뷡 ���� ��ŭ �迭����
	}

	@Override
	public void input() {
		for (int i = 0; i < num; i++) {
			MusicVO vo = new MusicVO();
			//
			System.out.print((i + 1) + "��° �뷡 ���� �Է� :");
			vo.setName_music(sc.next());

			System.out.print((i + 1) + "��° �뷡 ���� �Է� :");
			vo.setName_musician(sc.next());

			System.out.print((i + 1) + "��° �뷡 ���� �Է� [�ʴ���] :");
			vo.setLengthofMusic(sc.nextInt());

			System.out.print((i + 1) + "��° �뷡 ���� �Է� [5������] :");
			vo.setRating(sc.nextInt());
		}
	}

	public String print_star(int r) {
		String result = "";
		switch (r) {
		case 5:
			// System.out.println("�ڡڡڡڡ�");
			result = "�ڡڡڡڡ�";
			break;
		case 4:
			// System.out.println("�ڡڡڡ�");
			result = "�ڡڡڡ�";
			break;
		case 3:
			// System.out.println("�ڡڡ�");
			result = "�ڡڡ�";
			break;
		case 2:
			// System.out.println("�ڡ�");
			result = "�ڡ�";
			break;
		case 1:
			// System.out.println("��");
			result = "��";
			break;
		}
		return result;
	}

	@Override
	public void print() {

		Iterator<MusicVO> it = musicArray.iterator();
		while (it.hasNext()) {
			MusicVO vo = it.next();
			System.out.printf("%10s (%s) %d�� ����: %d (%s)\n", vo.getName_music(),
					vo.getName_musician(), vo.getLengthofMusic(),
					vo.getRating(), print_star(vo.getRating()));
		}

	}

}
