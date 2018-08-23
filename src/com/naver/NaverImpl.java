package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.score3.ScoreVO;

public class NaverImpl implements Naver {

	Scanner sc = new Scanner(System.in);

	private List<NaverVO> lists = new ArrayList<NaverVO>();

	@Override
	public void input() throws Exception {
		NaverVO vo = new NaverVO();

		// ���̵� �Է¹ޱ�
		try {
			System.out.print("���̵� �Է��ϼ��� : ");

			String id2 = sc.next();

			Iterator<NaverVO> it = lists.iterator();

			while (it.hasNext()) {
				NaverVO vo2 = it.next();
				if (id2.equals(vo2.getId())) {
					throw new Exception("�̹� ���̵� �����մϴ�.");
				}
			}
			vo.setId(id2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// ��й�ȣ �Է¹ޱ�
		boolean flag = false; // ���� Ȯ��
		boolean flag2 = false; // ���� Ȯ��
		try {
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			String pw1 = sc.next();
			// ��й�ȣ ��Ȯ��
			System.out.println(pw1);
			System.out.print("��й�ȣ�� �ѹ��� �Է��ϼ��� : ");
			String pw2 = sc.next();

			for (int i = 0; i < pw1.length(); i++) {
				char chr = pw1.charAt(i);
				if (!(chr > 'A' || chr < 'Z') && !(chr > 'a' || chr < 'z')
						&& !(chr > '1' || chr < '9')) {
					throw new Exception("���ڸ� �Է����ּ���");
				}

				if (chr >= '1' && chr <= '9') {
					flag = true;
				}
				if (chr >= 'A' && chr <= 'Z' || chr >= 'a' && chr <= 'z') {
					flag2 = true;
				}
			}

			if (!pw1.equals(pw2)) {
				throw new Exception("��й�ȣ�� ���� ��ġ ���� �ʽ��ϴ�.");
			} else if (!flag && flag2) {
				throw new Exception("���ڵ� ȥ���ؼ� �Է����ּ���");
			} else if (flag && !flag2) {
				throw new Exception("���ڵ� ȥ���ؼ� �Է����ּ���");
			}
			vo.setPw(pw1);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// �̸� �Է¹ޱ�
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		vo.setName(name);

		// ���� �Է¹ޱ�
		try {
			System.out.print("������ �Է��ϼ��� [���� OR ����]: ");
			String gender = sc.next();

			if (!(gender != "����" && gender != "����")) {
				throw new Exception("�����Է¿���");
			}
			vo.setGender(gender);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// ���� �Է¹ޱ�
		try {
			System.out.print("������� �Է��ϼ��� [XXXXXXXX] : ");
			String birth = sc.next();
			if (!(birth.length() == 8)) {
				throw new Exception("������������� ��ġ���� �ʽ��ϴ�.");
			}

			String birth2 = birth.trim();
			// String temp = birth2.substring(0, 4);
			// String temp2 = birth2.substring(4, 6);
			// String temp3 = birth2.substring(6);
			// String birth3 = temp;
			// birth3.concat("-");
			// birth3.concat(temp2);
			// birth3.concat("-");
			// birth3.concat(temp3);
			vo.setBirth(birth2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// �̸��� �Է¹ޱ�
		System.out.print("�̸����� �Է����ּ��� : ");
		String email = sc.next();
		System.out.println(email);
		vo.setEmail(email);

		try {
			System.out.print("�ڵ�����ȣ�� �Է����ּ��� : ");
			String tel = sc.next();
			String[] arr = tel.split("-");
			if (!(arr[0].equals("010"))) {
				throw new Exception("���ѹα� �ڵ��� ��ȣ�� �ƴմϴ�. ");
			}

			vo.setTel(tel);
		} catch (Exception e) {
			e.toString();
		}

		lists.add(vo);

	}

	@Override
	public void print() {
		System.out.printf("%10s %10s %4s %3s %15s %20s %20s\n", "�̸�", "���",
				"�̸�", "����", "�������", "�̸���", "����ȣ");
		System.out
				.println("---------------------------------------------------------------------------------");

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.println(vo.toString());
		}
	}

	@Override
	public void searchId() {
		String name;
		System.out.print("�˻��ϰ� ���� �̸��� �Է����ּ��� : ");
		name = sc.next();

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (vo.getName().equals(name)) {
				System.out.println(name + "�� ������ ã�ҽ��ϴ�.");
				System.out.println(vo.toString());
				break;

			} else {
				System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�. ");
				break;
			}
		}
	}

}
