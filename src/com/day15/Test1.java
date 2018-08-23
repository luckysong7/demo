package com.day15;

// 제너릭(Generic)

class Box<T> {
	private T t; // T : 자료형의 이름

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
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);

		Box b3 = new Box(); // b3 의 자료형은 Object가 된다.
		b3.set(30);  // upcast
		Integer ii = (Integer) b3.get(); // Downcast
		
		

	}
}
