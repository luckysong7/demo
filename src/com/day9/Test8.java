package com.day9;

class Test {
	private String title;
	protected int area;

	public void set(String title, int area) {
		this.title = title;
		this.area = area;

	}
	
	public void set(String title){
		this.title = title;
	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class Rect2 extends Test {
	private int w, h;

	// 생성자 - 변수 초기화
	// 아래꺼는 오버로딩 생성자
	public Rect2(int w, int h) {
		this.w = w;
		this.h = h;

	}

	public void rectArea() {
		super.area = w * h;
//		set("사각형", area);
		 set("사각형");
	}
}

public class Test8 {
	public static void main(String[] args) {
		Rect2 obj = new Rect2(10, 20);

		obj.rectArea();
		obj.print();
		
	}
}
