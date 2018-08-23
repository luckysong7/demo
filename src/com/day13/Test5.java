package com.day13;

import java.util.Vector;

//Collection Framework(방법)

// List(I) - ArrayList(C), Vector(C)
// Map(I) - Hashtable(C), HashMap(C), Treeset(C)


public class Test5 {
	
	public static void main(String[] args) {
		Vector v = new Vector();  
		// 벡터는 배열 타입을 오브젝트로 만들어준다
		// 그래서 여러가지의 타입을 담을 수 있다. 
		
		v.add("서울"); // upcast
		v.add(30); // upcast
		v.add('a'); // upcast
		
		String str = (String) v.get(0);
		System.out.println(str);
		int num = (int) v.get(1);
		System.out.println(num);
		char chr = (char) v.get(2);
		System.out.println(chr);
		
	}
}
