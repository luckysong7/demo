package com.day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test4 {
	public static void main(String[] args) {

		// Set : �ߺ��� ������� ����

		Set<String> s = new HashSet<String>();

		s.add("����");
		s.add("�뱸");
		s.add("�λ�");

		System.out.println(s);

		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}

		System.out.println();

		// �ߺ��� ������� ����
		s.add("����");
		System.out.println(s);

		// Stack
		Stack<String> st = new Stack<String>();

		st.push("����");
		st.add("�λ�");
		st.push("�뱸");
		st.push("����");

		// ����Ŀ� st�� �ִ� �����ʹ� �����ȴ�.

		while (!st.empty()) {
			System.out.print(st.pop() + " ");
		}

		System.out.println();

		if (st.empty()) {
			System.out.println("�ڷ� ����");
		} else {
			System.out.println("�ڷ� ����");
		}

		// Queue
		Queue<String> q = new LinkedList<String>();
		q.offer("����");
		q.add("ĳ����");
		q.offer("ȫ��");
		q.offer("����");

		while (q.peek() != null) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();

		// List

		List<String> list1 = new LinkedList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("I");
		list1.add("J");
		list1.add("K");

		List<String> list2 = new LinkedList<String>();
		list2.add("����");
		list2.add("����");
		list2.add("����");

		list2.addAll(list1);

		for (String ss : list1) {
			System.out.print(ss + " ");
		}

		System.out.println();
		for (String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();

		list2.subList(2, 5).clear();
		for (String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();
		
		String[] str = {"��","��","��","��","��"};
		
		for(String ss : str){
			System.out.print(ss + " ");
		}
		System.out.println();
		
		
		// ����
		
		Arrays.sort(str);
		for(String ss : str){
			System.out.print(ss + " ");
		}
		System.out.println();
		
		
		
	}
}
