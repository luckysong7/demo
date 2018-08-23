package com.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Vector 보다 성능이 좋다 
// ArrayList는 동기화 안됨
// Vector 는 동기화됨

public class Test2 {
	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<String>();
		lists.add("서울");
		lists.add("대구");
		lists.add("부산");

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
		lists1.add("인천");

		int n = lists1.indexOf("부산");
		lists1.add(n+1, "광주");
		
		System.out.println();
		
		for(String v : lists1){
			System.out.print(v +" ");
			
		}
		
		lists1.add("자바프로그래머");
		lists1.add("프레임워크");
		lists1.add("스트럿츠");
		lists1.add("자바란");
		lists1.add("스프링");
		
		System.out.println();
	
		Iterator<String> it3 = lists1.iterator();
		while(it3.hasNext()){
			String str ;
			str = it3.next();
			if(str.startsWith("자바")){
				System.out.print(str + " ");
			}
		}
	}
}
