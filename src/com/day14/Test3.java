package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

// set �� �ߺ���Ұ� ���� �÷��� Map�� Ű ���� ����-> Ű�� �ߺ� �Ұ� 

// Ű�� �ߺ����� ���̸� ������ ���� ����ȴ�.(�����)

// put : �� �Է� 

// get : �� ��������

public class Test3 {

	public static final String name[] = { "������", "ȫ����", "����", "����", "������" };

	public static final String tel[] = { "111-222", "333-456", "844-896",
			"111-222", "774-776" };

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();

		for (int i = 0; i < name.length; i++) {
			ht.put(tel[i], name[i]);
		}

		System.out.println(ht);

		String str;

		str = ht.get("111-2222"); // Ű���� �ش��ϴ� ���� ������

		if (str == null) {
			System.out.println("�ڷ����");
		} else {
			System.out.println(str);
		}

		// Ű�� �����ϴ��� �˻�
		if (ht.containsKey("333-456")) {
			System.out.println("333 ����");
		} else {
			System.out.println("333 �������� ����");
		}

		// �����Ͱ� �����ϴ��� �˻�
		if (ht.containsValue("õ����")) {
			System.out.println("���� �ִ�");
		} else {
			System.out.println("���� ����");
		}

		// ����
		ht.remove("333-456");

		if (ht.containsKey("333-456")) {
			System.out.println("333 ����");
		} else {
			System.out.println("333 �������� ����");
		}

		// ��ü ���

		Iterator<String> it = ht.keySet().iterator(); // keySet �� iterator �� ���
														// !!
														// hashmap ���� iterator
														// ����

		while (it.hasNext()) {
			String key = it.next(); // Ű�� ��ȯ
			String value = ht.get(key); // ���� ��ȯ 
			System.out.println(key +" / " + value);
		}

	}
}
