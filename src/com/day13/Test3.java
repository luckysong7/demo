package com.day13;

//내부클래스
//중첩

class Outer2 {
	static int a = 10;
	int b = 20;

	public static class Inner { // static 클래스는 맨 처음 메모리에 올라가있음

		int c = 30;

		public void write() {
			System.out.println("a : " + a);
			// System.out.println("b : " + b); // static 클래스에서 인스턴스 변수 사용 불가
			System.out.println("c : " + c);

			// 먼저 메모리에 올라가 있는 static클래스가 외부에 있는 클래스를 생성해주어야 함
			Outer2 out2 = new Outer2();
			System.out.println("out2.b : " + out2.b);
		}

	}

	public void print() {
		Inner ob = new Inner();
		ob.write();
	}

}

public class Test3 {
	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.print();
		
		Outer2.Inner inner = new Outer2.Inner();
		inner.write();
		
	}
}
