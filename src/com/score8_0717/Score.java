package com.score8_0717;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {
	Scanner sc = new Scanner(System.in);
	ScoreDAO1 dao = new ScoreDAO1();

	// 1. �߰�
	public void insert() {

		ScoreDTO dto = new ScoreDTO(); // insert �� �����Ҷ����� dto ��ü ����
		// ����ڷκ��� �� �޾ƿ���
		System.out.print("�й� ? ");
		dto.setHak(sc.next());
		System.out.print("�̸� ? ");
		dto.setName(sc.next());
		System.out.print("���� ? ");
		dto.setKor(sc.nextInt());
		System.out.print("���� ? ");
		dto.setEng(sc.nextInt());
		System.out.print("���� ? ");
		dto.setMat(sc.nextInt());

		int result = dao.insertData(dto);

		if (result != 0) {
			System.out.println("������ �߰� ���� !");
		} else {
			System.out.println("������ �߰� ���� ...");
		}
	}

	// 2. ����
	public void update() {
		ScoreDTO dto = new ScoreDTO();

		System.out.print("������Ʈ�� �й� ?");
		dto.setHak(sc.next());
		System.out.print("���� ? ");
		dto.setKor(sc.nextInt());
		System.out.print("���� ? ");
		dto.setEng(sc.nextInt());
		System.out.print("���� ? ");
		dto.setMat(sc.nextInt());

		int result = dao.updateData(dto);

		if (result != 0) {
			System.out.println("������ ������Ʈ ���� !");
		} else {
			System.out.println("������ ������Ʈ ���� ...");
		}
	}

	// 3. ������ ����
	public void delete() {

		System.out.print("������ �й� ? ");

		int result = dao.deleteData(sc.next());

		if (result != 0) {
			System.out.println("������ ���� ���� !");
		} else {
			System.out.println("������ ���� ���� ...");
		}
	}

	// 4. ������ ���

	public void selectAll() {
		List<ScoreDTO> lists = dao.selectAllData();
		Iterator<ScoreDTO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}
	
	// 5. ������ ����
	public void searchHak(){
		System.out.print("�˻��� �й� ? ");
		String searchHak = sc.next();
		
		ScoreDTO dto = dao.selectData(searchHak);
		if(dto != null){
			System.out.println(dto.toString());
		}else{
			System.out.println("�й��� �������� �ʽ��ϴ�. ");
		}	
	}
}
