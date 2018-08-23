package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

// set 은 중복요소가 없는 컬렉션 Map의 키 값에 사용됨-> 키는 중복 불가 

// 키가 중복적인 값이면 마지막 값이 저장된다.(덮어쓰기)

// put : 갑 입력 

// get : 값 가져오기

public class Test3 {

	public static final String name[] = { "최유정", "홍진영", "제니", "지수", "송혜교" };

	public static final String tel[] = { "111-222", "333-456", "844-896",
			"111-222", "774-776" };

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();

		for (int i = 0; i < name.length; i++) {
			ht.put(tel[i], name[i]);
		}

		System.out.println(ht);

		String str;

		str = ht.get("111-2222"); // 키값에 해당하는 값을 가져옴

		if (str == null) {
			System.out.println("자료없음");
		} else {
			System.out.println(str);
		}

		// 키가 존재하는지 검사
		if (ht.containsKey("333-456")) {
			System.out.println("333 존재");
		} else {
			System.out.println("333 존재하지 않음");
		}

		// 데이터가 존재하는지 검사
		if (ht.containsValue("천송이")) {
			System.out.println("송이 있다");
		} else {
			System.out.println("송이 없다");
		}

		// 삭제
		ht.remove("333-456");

		if (ht.containsKey("333-456")) {
			System.out.println("333 존재");
		} else {
			System.out.println("333 존재하지 않음");
		}

		// 전체 출력

		Iterator<String> it = ht.keySet().iterator(); // keySet 의 iterator 를 사용
														// !!
														// hashmap 에는 iterator
														// 없음

		while (it.hasNext()) {
			String key = it.next(); // 키를 반환
			String value = ht.get(key); // 값을 반환 
			System.out.println(key +" / " + value);
		}

	}
}
