package com.day15;

// ���ʸ�(Generic)

class Box<T> {
	private T t; // T : �ڷ����� �̸�

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();

		b1.set(10); // b1.set(new Integer(10));

		Integer i = b1.get();
		System.out.println(i); // Integer.toString(i);
		System.out.println(Integer.toString(i));

		Box<String> b2 = new Box<String>();
		b2.set("����");
		String s = b2.get();
		System.out.println(s);

		Box b3 = new Box(); // b3 �� �ڷ����� Object�� �ȴ�.
		b3.set(30);  // upcast
		Integer ii = (Integer) b3.get(); // Downcast
		
		

	}
}
