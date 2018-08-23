package com.day8;

class Rect {
	private int w, h;

	// �� �ޱ�
	public void set(int w, int h) {
		this.setW(w);
		this.setH(h);
	}

	// ���� ��ȯ
	public int area() {
		return getW() * getH();
	}

	// �ѷ����� ��ȯ
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
		System.out.println("���� :" + getW());
		System.out.println("���� :" + getH());
		System.out.println("���� :" + a);
		System.out.println("�ѷ� :" + l);

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
