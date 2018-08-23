package com.day13;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {
	private static final String city[] = { "서울", "부산", "대구", "인천", "수원", "광주",
			"대전", "울산" }; // 배열

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(); // String 형태의 벡터
		// 일반적으로 같은형태의 자료형을 담는 벡터를 생성

		// for(int i = 0 ; i < city.length; i++){
		// v.add(city[i]);
		// }

		for (String n : city) {
			v.add(n);
		}

		String str;
		str = v.firstElement(); // 첫번째 값
		System.out.println("첫번째 요소 : " + str);

		str = v.lastElement(); // 마지막 값
		System.out.println("마지막번째 요소 : " + str);

		str = v.get(2); // 두번째 값
		System.out.println("세번째 요소 : " + str);

		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		//Iterator : 반복자 
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()){ // 값을 가지고 있을때 까지 
			// hasNext() 다음 인덱스로 이동 
			
			str = it.next(); // 값 넣기 
			System.out.print(str + " ");
			
		}
		
		
	}
}
