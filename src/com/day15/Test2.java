package com.day15;

class Box2<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U> void print(U u) { // U 는 메소드에서만 사용
		System.out.println(u);
		System.out.println("t 클래스 : " + t.getClass().getName());
		System.out.println("u 클래스 : " + u.getClass().getName());

	}
}

public class Test2 {
	public static void main(String[] args) {

		Box2<Integer> b = new Box2<Integer>();  //T 의 자료형은 Integer 로 지정
		b.set(new Integer(30));
		b.print("test"); // U 의 자료형은 String으로 지정
		
	}
}
