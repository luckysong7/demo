package com.musicinfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

import com.score3.ScoreVO;

public class MusicImpl implements Music {

	Scanner sc = new Scanner(System.in);
	private int num; // 입력할 노래 개수 받을 변수
	// private Record[] musicArray; // Record객체 하나하나 받을 배열
	private List<MusicVO> musicArray; // 업캐스트가 더 높은 언어수준

	// // List의 명령어를 쓴다
	@Override
	public void set() {
		do {
			System.out.print("입력할 노래 개수 ?");
			num = sc.nextInt();
		} while (num < 1 || num > 5); // 1 ~ 5사이의 노래개수만 가능

		musicArray = new ArrayList<MusicVO>(); // 받아온 노래 개수 만큼 배열생성
	}

	@Override
	public void input() {
		for (int i = 0; i < num; i++) {
			MusicVO vo = new MusicVO();
			//
			System.out.print((i + 1) + "번째 노래 제목 입력 :");
			vo.setName_music(sc.next());

			System.out.print((i + 1) + "번째 노래 가수 입력 :");
			vo.setName_musician(sc.next());

			System.out.print((i + 1) + "번째 노래 길이 입력 [초단위] :");
			vo.setLengthofMusic(sc.nextInt());

			System.out.print((i + 1) + "번째 노래 평점 입력 [5점만점] :");
			vo.setRating(sc.nextInt());
		}
	}

	public String print_star(int r) {
		String result = "";
		switch (r) {
		case 5:
			// System.out.println("★★★★★");
			result = "★★★★★";
			break;
		case 4:
			// System.out.println("★★★★");
			result = "★★★★";
			break;
		case 3:
			// System.out.println("★★★");
			result = "★★★";
			break;
		case 2:
			// System.out.println("★★");
			result = "★★";
			break;
		case 1:
			// System.out.println("★");
			result = "★";
			break;
		}
		return result;
	}

	@Override
	public void print() {

		Iterator<MusicVO> it = musicArray.iterator();
		while (it.hasNext()) {
			MusicVO vo = it.next();
			System.out.printf("%10s (%s) %d초 평점: %d (%s)\n", vo.getName_music(),
					vo.getName_musician(), vo.getLengthofMusic(),
					vo.getRating(), print_star(vo.getRating()));
		}

	}

}
