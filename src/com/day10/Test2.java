package com.day10;

class Test {  // extends Object �� �����Ǿ� ���� 
	// ��� Ŭ������ ������ Object
	private int a = 10;

	public void write() {
		System.out.println("a : " + a);
	}
}

public class Test2 {
	public static void main(String[] args) {

		Test ob1 = new Test();
		Test ob2 = new Test();
		
		System.out.println("ob1==ob2 : " + (ob1==ob2)); // false
		
		System.out.println("ob1.equals(ob2) : " + ob1.equals(ob2)); // false
		// Object�� equals �� �ּҸ� ���Ѵ�.
		
		System.out.println("ob1 : " + ob1);
		System.out.println(ob1.toString());
		System.out.println("ob2 : " + ob2);
		System.out.println(ob2.toString());
		
		
	}

}
