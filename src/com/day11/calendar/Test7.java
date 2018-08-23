package com.day11.calendar;

// �߻�Ŭ����
// �޸��� ���� ���� Ŭ������ �̸� ���� 
// �޼ҵ带 �������ؼ� ��� 

abstract class ShapeClass{
	abstract void draw(); // �߻�޼ҵ� : ������ ������ �ؼ� ����ؾ���
}

class Cir extends ShapeClass{

	@Override
	void draw() {
		System.out.println("���� �׸���...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}

class Tri extends ShapeClass{

	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���...");
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
