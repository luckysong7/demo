package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);
	// private Map<String, ScoreVO> hMap = new Hashtable<String, ScoreVO>();
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>(); // 오름차순
																		// 정렬

	String hak;

	@Override
	public void input() {
		System.out.print("학번 ? ");
		hak = sc.next();
		if (searchHak(hak)) {
			System.out.println("학번이 이미 존재합니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();

		System.out.println("이름 ? ");
		vo.setName(sc.next());

		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());

		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());

		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("데이터 입력 완료 ! ");

	}

	@Override
	public boolean searchHak(String hak) {
		if (hMap.containsKey(hak)) {
			return true;
		}
		return false;

	}

	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			ScoreVO vo = hMap.get(key);

			System.out.println(key + " " + vo.toString());
		}
	}

	@Override
	public void remove() {
		System.out.println("삭제할 학번 입력 : ");
		String hak = sc.next();
		if (!(searchHak(hak))) {
			System.out.println("학번이 존재하지 않습니다.");
		} else {
			hMap.remove(hak);
			System.out.println("["+ hak+"]" + "의 학생정보 삭제 성공 ! ");
		}
	}

	@Override
	public void insert() {
		System.out.println("수정할 학번 입력 : ");
		String hak = sc.next();

		if (!(searchHak(hak))) {
			System.out.println("학번이 존재하지 않습니다.");
		} else {

			ScoreVO vo = hMap.get(hak);
			System.out.println(hak + "의 학생의 국어 ? ");
			vo.setKor(sc.nextInt());

			System.out.println(hak + "의 학생의 영어 ? ");
			vo.setEng(sc.nextInt());

			System.out.println(hak + "의 학생의 수학 ? ");
			vo.setMat(sc.nextInt());

			System.out.println("["+hak +"]"+ "의 학생정보 업데이트 완료");

			System.out.println(hMap.get(hak));
		}
	}

	@Override
	public void findName() {
		System.out.println("검색할 이름 입력 : ");
		String name = sc.next();
		Iterator<String> it2 = hMap.keySet().iterator();
		boolean check = false;
		while(it2.hasNext()){
			String key = it2.next();
			String name2 = hMap.get(key).getName();
			if(name.equals(name2)){
				System.out.println("["+ name+"]" + "의 학생정보");
				System.out.println(hMap.get(key));
				check = true;
				break;
			}
		}
		if(!check){
			System.out.println("해당하는 이름의 데이터가 없습니다. ");
		}
	}

	@Override
	public void findHak() {
		System.out.println("검색할 학번 입력 : ");
		String hak = sc.next();
		if(!hMap.containsKey(hak)){
			System.out.println(hak + "의 학번이 존재하지 않습니다.");
		}else{
			System.out.println("["+hak+"]" + "의 학번 검색 결과 ");
			System.out.println(hMap.get(hak));
		}
	
	}

}
