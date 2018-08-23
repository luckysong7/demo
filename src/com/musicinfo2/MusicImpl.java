package com.musicinfo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.musicinfo.MusicVO;

public class MusicImpl implements Music {

	private List<MusicVO> lists = new ArrayList<MusicVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {
		int result = 0;

		MusicVO vo = new MusicVO();

		System.out.print("�뷡 ���� ? ");
		vo.setName_music(sc.next());

		System.out.print("���� �̸� ? ");
		vo.setName_musician(sc.next());

		System.out.print("�뷡 ���� ? ");
		vo.setLengthofMusic(sc.nextInt());

		System.out.print("���� ? ");
		vo.setRating(sc.nextInt());

		lists.add(vo);

		return 0;

	}

	@Override
	public void print() {

		Iterator<MusicVO> it = lists.iterator();
		while (it.hasNext()) {
			MusicVO vo = it.next();
			System.out.println(vo.toString());
			System.out.println("");
		}
	}

}
