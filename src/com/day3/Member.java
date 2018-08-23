package com.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Member {

	private List<MemberVO> lists = null; // ȸ������ ���� ����Ʈ
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\memberInfoList.txt"); // ȸ������ ���� ����
																	// ��ġ

	MemberAuthen auth = new MemberAuthen(); // ����ó�� Ŭ����
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String id;

	@SuppressWarnings("unchecked")
	public Member() {

		try {

			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<MemberVO>) ois.readObject();

				fis.close();
				ois.close();
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public boolean findId(String id) {

		if (lists == null) {
			return false;
		}
		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {
			MemberVO vo = it.next();
			if (id.equals(vo.getId())) {
				return true;
			}
		}
		return false;

	}



	public void signup() {

		MemberVO vo = new MemberVO();

		try {

			System.out
					.print("���Ͻô� ID�� �Է��ϼ���.\n*���ڸ� 1���̻� ������ 8~15�ڸ��� �Է����ּ���*\n");
			id = sc.next();

			auth.inputID(id);

			if (findId(id)) {
				System.out.println("�Է��Ͻ� ���̵� : " + "[" + id + "]"
						+ " (��)�� �̹� �����մϴ�. �ٽ� �Է����ּ���.");
				return;
			}

			vo.setId(id);

			// --------------------------------------------------------
			System.out
					.print("���Ͻô� PASSWORD�� �Է��ϼ���.\n*���ڸ� 1���̻� ������ 8�̻��� �Է����ּ���*\n");
			String pw1 = sc.next();

			if (pw1.equals(vo.getId())) {
				System.out.println("���̵�� ������ ��й�ȣ�� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.");
				return;
			}
			auth.inputPW(pw1);

			System.out.print("��й�ȣ�� �ѹ� �� �Է����ּ���.\n");
			String pw2 = sc.next();
			auth.inputPW(pw2);
			auth.checkingPW(pw1, pw2);
			vo.setPw(pw1);
			// ------------------------------------------------------
			System.out.println("�̸��� �Է��ϼ���.");
			vo.setName(sc.next());

			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			vo.setTel(sc.next());

			System.out.println("�ּҸ� �Է��ϼ���.");
			vo.setAddress(br.readLine());

			if (lists == null) {
				lists = new ArrayList<MemberVO>();
			}

			lists.add(vo);

			System.out.println();
			System.out.println("���ϵ帳�ϴ�! ȸ�������� �Ϸ�Ǿ����ϴ�.");
			// -------------------------[[�ڵ�����]]--------------------
			if (lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();
				// System.out.println("���� ���� ���� Ȯ������Ʈ");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void printMemberInfo() {
		// String id;

		System.out.print("�˻��ϰ� ���� ȸ�� ID�� �Է��ϼ��� : ");
		id = sc.next();

		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {

			MemberVO vo = it.next();
			if (vo.getId().equals(id)) {
				System.out.println(id + "���� ȸ�������� ã�ҽ��ϴ�.\n\n");
				System.out
						.println("======================================================================================================================");
				System.out
						.println("||    Name    ||     Phone Number    ||                  Address                  ||     Status of Renting Book     ||");
				System.out
						.println("======================================================================================================================");
				System.out.println(vo.toString() + "\n\n");
			} else {
				System.out.println(id + "�� ���� ȸ�������� �����ϴ�.\n\n");
				break;
			}
		}
	}
}
