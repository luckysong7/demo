package com.day13;

import java.util.Vector;

//Collection Framework(���)

// List(I) - ArrayList(C), Vector(C)
// Map(I) - Hashtable(C), HashMap(C), Treeset(C)


public class Test5 {
	
	public static void main(String[] args) {
		Vector v = new Vector();  
		// ���ʹ� �迭 Ÿ���� ������Ʈ�� ������ش�
		// �׷��� ���������� Ÿ���� ���� �� �ִ�. 
		
		v.add("����"); // upcast
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
