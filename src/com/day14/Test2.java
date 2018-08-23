package com.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Vector ���� ������ ���� 
// ArrayList�� ����ȭ �ȵ�
// Vector �� ����ȭ��

public class Test2 {
	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<String>();
		lists.add("����");
		lists.add("�뱸");
		lists.add("�λ�");

		Iterator<String> it1 = lists.iterator();
		while (it1.hasNext()) {
			String str = it1.next();
			System.out.print(str + " ");

		}
		System.out.println();

		ListIterator<String> it2 = lists.listIterator();

		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

		System.out.println();
		while (it2.hasPrevious()) {
			System.out.print(it2.previous() + " ");
		}
		
		List<String> lists1 = new ArrayList<String>();  // UPCAST
		
		lists1.addAll(lists);
		lists1.add("��õ");

		int n = lists1.indexOf("�λ�");
		lists1.add(n+1, "����");
		
		System.out.println();
		
		for(String v : lists1){
			System.out.print(v +" ");
			
		}
		
		lists1.add("�ڹ����α׷���");
		lists1.add("�����ӿ�ũ");
		lists1.add("��Ʈ����");
		lists1.add("�ڹٶ�");
		lists1.add("������");
		
		System.out.println();
	
		Iterator<String> it3 = lists1.iterator();
		while(it3.hasNext()){
			String str ;
			str = it3.next();
			if(str.startsWith("�ڹ�")){
				System.out.print(str + " ");
			}
		}
	}
}
