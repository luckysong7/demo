package com.day8;

// static 
// �ڱⰡ �˾Ƽ� �޸𸮷� �ö�
// 1000���� ���� �޸𸮰����� �Ѱ��� ��� 

public class Test2 {
	public static int a = 10;
	// Ŭ���������� Ŭ�����޼ҵ� �ε��Ǵ� ����
	// �޸� �Ҵ��� �̷������ (Ŭ�����̸�, ��ü�̸�)
	// ��, new�� ������� �ʰ� �ٷ� ����� �� ����
	
	private int b = 20;
	// ������ Ŭ������ intance �޼ҵ� �ȿ��� �ٷ� ������ ����
	// ������ Ŭ�����޼ҵ忡���� ������ �� ����.
	// Ŭ���� �޼ҵ忡�� �����ϱ� ���ؼ��� new �� ���� ��ü�� �����ϰ�
	// ��ü �̸����θ� ������ ����
	
	
	
	public void write(){ //�ν��Ͻ� �޼ҵ�
		
		System.out.println("class ���� : " + a);
		System.out.println("instance ���� : " + b);
		
	}
	
	public static void print(){
		System.out.println("class ���� : " + a);
//		System.out.println("instance ���� : " + b); 
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Ŭ���� ���� a : " + a);
		System.out.println("Ŭ���� ���� Test2 �� a : " + Test2.a);
		
//		print(); // Italic ü�� �Ǿ� ������ class ������ ����� �� ������ �˼� �ִ�. 
		Test2.print();
		Test2 ob1 = new Test2();
		
		
		System.out.println("�ν��Ͻ� ���� b : " + ob1.b);
		ob1.write();
		ob1.print(); // Ŭ�����޼ҵ�� ���� �̷��� �� �ʿ������ �˷��� -> static way�� ȣ��
		System.out.println("Ŭ���� ���� a : " + ob1.a);// Ŭ���������� ���� �̷��� �� �ʿ������ �˷��� -> static way�� ȣ��
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("ob2-----------------------");
		ob2.write();
		
		System.out.println("ob1-----------------------");
		ob1.write();
	}
	
}
