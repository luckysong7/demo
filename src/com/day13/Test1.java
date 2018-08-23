package com.day13;

class Outer {
	static int a = 10;
	int b = 20;

	public class Inner { // Inner 클래스를 사용하려면 Outer 클래스 객체를 생성해줘야 한다 !!
		// 객체 생성 순서는 Outer 생성 하고 Inner 생성
		// Outer 생성한다고 해서 Inner 가 자동으로 생성되는것은 아니다
		int c = 30;

		public void write() {

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

		}

	}

	public void print() {
		Inner ob = new Inner();
		ob.write();
	}

}

public class Test1 {

	public static void main(String[] args) {

		Outer out = new Outer(); // 외부클래스 객체생성
		out.print();
		
		Outer.Inner inner = out.new Inner() ;
		inner.write();
		
		
		
	}
}
