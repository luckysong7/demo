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

	// ������ - ���� �ʱ�ȭ
	// �Ʒ����� �����ε� ������
	public Rect2(int w, int h) {
		this.w = w;
		this.h = h;

	}

	public void rectArea() {
		super.area = w * h;
//		set("�簢��", area);
		 set("�簢��");
	}
}

public class Test8 {
	public static void main(String[] args) {
		Rect2 obj = new Rect2(10, 20);

		obj.rectArea();
		obj.print();
		
	}
}
