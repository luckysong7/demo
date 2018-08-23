package com.score8_0717;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	ScoreDAO1 dao = new ScoreDAO1();

	// 1. 추가
	public void insert() {

		ScoreDTO dto = new ScoreDTO(); // insert 를 수행할때마다 dto 객체 생성
		// 사용자로부터 값 받아오기
		System.out.print("학번 ? ");
		dto.setHak(sc.next());
		System.out.print("이름 ? ");
		dto.setName(sc.next());
		System.out.print("국어 ? ");
		dto.setKor(sc.nextInt());
		System.out.print("영어 ? ");
		dto.setEng(sc.nextInt());
		System.out.print("수학 ? ");
		dto.setMat(sc.nextInt());

		int result = dao.insertData(dto);

		if (result != 0) {
			System.out.println("데이터 추가 성공 !");
		} else {
			System.out.println("데이터 추가 실패 ...");
		}
	}

	// 2. 수정
	public void update() {
		ScoreDTO dto = new ScoreDTO();

		System.out.print("업데이트할 학번 ?");
		dto.setHak(sc.next());
		System.out.print("국어 ? ");
		dto.setKor(sc.nextInt());
		System.out.print("영어 ? ");
		dto.setEng(sc.nextInt());
		System.out.print("수학 ? ");
		dto.setMat(sc.nextInt());

		int result = dao.updateData(dto);

		if (result != 0) {
			System.out.println("데이터 업데이트 성공 !");
		} else {
			System.out.println("데이터 업데이트 실패 ...");
		}
	}

	// 3. 데이터 삭제
	public void delete() {

		System.out.print("삭제할 학번 ? ");

		int result = dao.deleteData(sc.next());

		if (result != 0) {
			System.out.println("데이터 삭제 성공 !");
		} else {
			System.out.println("데이터 삭제 실패 ...");
		}
	}

	// 4. 데이터 출력

	public void selectAll() {
		List<ScoreDTO> lists = dao.selectAllData();
		Iterator<ScoreDTO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}
	
	// 5. 데이터 선택
	public void searchHak(){
		System.out.print("검색할 학번 ? ");
		String searchHak = sc.next();
		
		ScoreDTO dto = dao.selectData(searchHak);
		if(dto != null){
			System.out.println(dto.toString());
		}else{
			System.out.println("학번이 존재하지 않습니다. ");
		}	
	}
}
