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

		// Set : 중복을 허용하지 않음

		Set<String> s = new HashSet<String>();

		s.add("서울");
		s.add("대구");
		s.add("부산");

		System.out.println(s);

		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}

		System.out.println();

		// 중복을 허용하지 않음
		s.add("서울");
		System.out.println(s);

		// Stack
		Stack<String> st = new Stack<String>();

		st.push("서울");
		st.add("부산");
		st.push("대구");
		st.push("광주");

		// 출력후에 st에 있는 데이터는 삭제된다.

		while (!st.empty()) {
			System.out.print(st.pop() + " ");
		}

		System.out.println();

		if (st.empty()) {
			System.out.println("자료 없음");
		} else {
			System.out.println("자료 있음");
		}

		// Queue
		Queue<String> q = new LinkedList<String>();
		q.offer("유럽");
		q.add("캐나다");
		q.offer("홍콩");
		q.offer("몽골");

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
		list2.add("서울");
		list2.add("수원");
		list2.add("서산");

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
		
		String[] str = {"라","나","마","가","다"};
		
		for(String ss : str){
			System.out.print(ss + " ");
		}
		System.out.println();
		
		
		// 정렬
		
		Arrays.sort(str);
		for(String ss : str){
			System.out.print(ss + " ");
		}
		System.out.println();
		
		
		
	}
}
