package com.day13;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {
	private static final String city[] = { "����", "�λ�", "�뱸", "��õ", "����", "����",
			"����", "���" }; // �迭

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // String ������ ����
		// �Ϲ������� ���������� �ڷ����� ��� ���͸� ����

		// for(int i = 0 ; i < city.length; i++){
		// v.add(city[i]);
		// }

		for (String n : city) {
			v.add(n);
		}

		String str;
		str = v.firstElement(); // ù��° ��
		System.out.println("ù��° ��� : " + str);

		str = v.lastElement(); // ������ ��
		System.out.println("��������° ��� : " + str);

		str = v.get(2); // �ι�° ��
		System.out.println("����° ��� : " + str);

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		//Iterator : �ݺ��� 
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()){ // ���� ������ ������ ���� 
			// hasNext() ���� �ε����� �̵� 
			
			str = it.next(); // �� �ֱ� 
			System.out.print(str + " ");
			
		}
		
		
	}
}
