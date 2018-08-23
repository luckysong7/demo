package com.day11.calendar;

// 추상클래스
// 메모리의 낭비 없이 클래스를 미리 설계 
// 메소드를 재정의해서 사용 

abstract class ShapeClass{
	abstract void draw(); // 추상메소드 : 무조건 재정의 해서 사용해야함
}

class Cir extends ShapeClass{

	@Override
	void draw() {
		System.out.println("원을 그린다...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	void draw() {
		System.out.println("사각형을 그린다...");
	}
	
}

class Tri extends ShapeClass{

	@Override
	void draw() {
		System.out.println("삼각형을 그린다...");
	}
	
}

public class Test7 {
	
	public static void main(String[] args) {
		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
	}


}
