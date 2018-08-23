package com.day9;

class SuperClass{
	
	private String title;
	protected double area;
	
	public SuperClass(){
		
	}
	
	public SuperClass(String title){
		this.title = title;
	}
	
	public void write(){
		System.out.println("title : " + area);
		
	}
	
}
// �ڹٴ� ���� ���
class Circle extends SuperClass{
	private int r ;
	protected static final double PI = 3.14; // ��� - ���α׷� ������ ������ �� ���� �Ұ�
	

	
	public Circle(int r){
		super("��"); // �θ�������߿� �����ε��� �����ڸ� ȣ��
		this.r = r;
	}
	
	public void circleArea(){
		area = (double) r * r * PI;
	}
	
	
	
}

class RectC extends SuperClass{
	private int w,h;
	
	
	public void rectArea(int w, int h){
		this.w = w;
		this.h = h;
		area = w*h;
	}
	// �޼ҵ� �������̵� 
	// �θ� Ŭ������ �޼ҵ带 ��ӹ޾� �ڱ�Ϳ� �°� ���� �����Ͽ� ����
	// �޼ҵ� �̸��� ���� !
	// �ڽ�Ŭ������ �޼ҵ�� 
	// �θ�Ŭ������ �޼ҵ尡 ������
	// �ڱ� �ڽŰ��� �޼ҵ常 ��� 
	// �θ� Ŭ������ �޼ҵ� ������
	@Override
	public void write(){
	
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + area);
	}
	
}

public class Test9 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		
		System.out.println("===========================");
		
		RectC ob2 = new RectC();
		ob2.rectArea(10, 20);
		ob2.write();
	}

}
