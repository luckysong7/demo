package com.day8;

class Rect {
	private int w, h;

	// 값 받기
	public void set(int w, int h) {
		this.setW(w);
		this.setH(h);
	}

	// 면적 변환
	public int area() {
		return getW() * getH();
	}

	// 둘레길이 반환
	public int length() {
		return (getW() + getH()) * 2;
	}

	public int getWidth() {
		return this.getW();
	}

	public int getLength() {
		return this.getH();
	}

	public void print(int a, int l) {
		System.out.println("가로 :" + getW());
		System.out.println("세로 :" + getH());
		System.out.println("넓이 :" + a);
		System.out.println("둘레 :" + l);

	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

}

public class Test4 {
	public static void main(String[] args) {
		Rect obj1 = new Rect();
		obj1.set(10, 50);

		int area = obj1.area();
		int length = obj1.length();

		obj1.print(area, length);
	}
}
