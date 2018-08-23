package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);
	// private Map<String, ScoreVO> hMap = new Hashtable<String, ScoreVO>();
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>(); // ��������
																		// ����

	String hak;

	@Override
	public void input() {
		System.out.print("�й� ? ");
		hak = sc.next();
		if (searchHak(hak)) {
			System.out.println("�й��� �̹� �����մϴ�.");
			return;
		}
		ScoreVO vo = new ScoreVO();

		System.out.println("�̸� ? ");
		vo.setName(sc.next());

		System.out.print("���� ? ");
		vo.setKor(sc.nextInt());

		System.out.print("���� ? ");
		vo.setEng(sc.nextInt());

		System.out.print("���� ? ");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("������ �Է� �Ϸ� ! ");

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
		System.out.println("������ �й� �Է� : ");
		String hak = sc.next();
		if (!(searchHak(hak))) {
			System.out.println("�й��� �������� �ʽ��ϴ�.");
		} else {
			hMap.remove(hak);
			System.out.println("["+ hak+"]" + "�� �л����� ���� ���� ! ");
		}
	}

	@Override
	public void insert() {
		System.out.println("������ �й� �Է� : ");
		String hak = sc.next();

		if (!(searchHak(hak))) {
			System.out.println("�й��� �������� �ʽ��ϴ�.");
		} else {

			ScoreVO vo = hMap.get(hak);
			System.out.println(hak + "�� �л��� ���� ? ");
			vo.setKor(sc.nextInt());

			System.out.println(hak + "�� �л��� ���� ? ");
			vo.setEng(sc.nextInt());

			System.out.println(hak + "�� �л��� ���� ? ");
			vo.setMat(sc.nextInt());

			System.out.println("["+hak +"]"+ "�� �л����� ������Ʈ �Ϸ�");

			System.out.println(hMap.get(hak));
		}
	}

	@Override
	public void findName() {
		System.out.println("�˻��� �̸� �Է� : ");
		String name = sc.next();
		Iterator<String> it2 = hMap.keySet().iterator();
		boolean check = false;
		while(it2.hasNext()){
			String key = it2.next();
			String name2 = hMap.get(key).getName();
			if(name.equals(name2)){
				System.out.println("["+ name+"]" + "�� �л�����");
				System.out.println(hMap.get(key));
				check = true;
				break;
			}
		}
		if(!check){
			System.out.println("�ش��ϴ� �̸��� �����Ͱ� �����ϴ�. ");
		}
	}

	@Override
	public void findHak() {
		System.out.println("�˻��� �й� �Է� : ");
		String hak = sc.next();
		if(!hMap.containsKey(hak)){
			System.out.println(hak + "�� �й��� �������� �ʽ��ϴ�.");
		}else{
			System.out.println("["+hak+"]" + "�� �й� �˻� ��� ");
			System.out.println(hMap.get(hak));
		}
	
	}

}
