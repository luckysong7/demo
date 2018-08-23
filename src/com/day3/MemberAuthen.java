package com.day3; 

public class MemberAuthen {
	
	//���̵� üũ �޼ҵ� 
	public void inputID(String id) throws Exception {

		if (id.length() < 8 || id.length() > 15) {
			throw new Exception("8~15�ڸ� �̳���  �Է����ּ���. " + "\n��� ������ ���̵� : "
					+ "[" + id + "]" + " (��)�� " + id.length() + " �ڸ��Դϴ�.");
		}

		int eng = 0;
		int num = 0;

		for (int i = 0; i < id.length(); i++) {

			char ch = id.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				eng++;
			else if (ch >= '0' && ch <= '9')
				num++;
		}

		if (eng == 0 || num == 0) {
			throw new Exception("������ �� ���ڸ� ����Ͽ� ������ּ���.");
		}
	}

	// ��й�ȣ üũ �޼ҵ�
	public void inputPW(String pw) throws Exception {

		if (pw.length() < 8) {
			throw new Exception("8�� �̻��� ��й�ȣ�� �Է��ϼ���! :" + "\n��� ������ ��й�ȣ : "
					+ "[" + pw + "]" + "(��)��" + "[" + pw.length() + "]"
					+ " �ڸ��Դϴ�.");
		}

		boolean flag1 = false;
		boolean flag2 = false;

		for (int i = 0; i < pw.length(); i++) {

			char c = pw.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				flag1 = true;
			} else if (c >= '0' && c <= '9') {
				flag2 = true;
			} else {
				throw new Exception("������ �� ���ڸ� �����մϴ�.");
			}
		}
		if (flag1 == false || flag2 == false) {
			throw new Exception("�����ڿ� ���ڸ� ����Ͽ� ��й�ȣ�� ������ּ���.");
		}
	}
	
	// 1�� ��й�ȣ�� 2�� ��й�ȣ�� ������ üũ �޼ҵ�
	public void checkingPW(String pw1, String pw2) throws Exception {
		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			throw new Exception("��й�ȣ�� ���� ��ġ ���� �ʽ��ϴ�.");
		}
	}

}
