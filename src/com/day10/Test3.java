package com.day10;

//String�� class �̴�.

public class Test3 {
	public static void main(String[] args) {
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		// ���ڿ��� ������ �� ������ ���� ���� ����Ű�� ��
		
		String ob3 = new String("Seoul");
		String ob4 = new String("Seoul");
		
		String ob5 = "Suwon";
		String ob6 = new String("Suwon");
		
		System.out.println("ob1 == ob2 : " + (ob1 == ob2)); // true
		System.out.println("ob1 == ob2 : " + ob1.equals(ob2)); // true
		System.out.println("ob1 == ob3 : " + (ob1 == ob3)); // false
		System.out.println("ob1 == ob3 : " + ob1.equals(ob3)); // true
		
		System.out.println("ob3 == ob4 : " + (ob3 == ob4)); // false
		System.out.println("ob3 == ob4 : " + ob3.equals(ob4)); // true
		
		System.out.println("ob1 == ob5 : " + (ob1 == ob5));  
		System.out.println("ob1 == ob5 : " + ob1.equals(ob5));
		
		System.out.println("ob3 == ob6 : " + (ob3 == ob6));
		System.out.println("ob3 == ob6 : " + ob3.equals(ob6));
		
		
		// Hasecode
		
		// ó���ϴ� �����ʹ� ����ϰ� ���󵵴� ���� ������ 
		// �����ʹ� Heap ������ �����ϰ� 
		// ����ϴ� ����� 
		
		
		System.out.println(ob1);
		System.out.println(ob1.toString());
		
	}
}
