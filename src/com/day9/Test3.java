package com.day9;

public class Test3 {
	int a = 5;

	{ // �ʱ�ȭ ��

		System.out.println("�ʱ�ȭ �� : a =" + a);
		a = 10;
		System.out.println("�ʱ�ȭ �� : a =" + a);

	}

	static int b;

	static { // static �ʱ�ȭ ��
		b = 10;
		System.out.println("static �� : b =" + b);

	}
	
	final double PI ; // ��� (�ѹ� ���� �����Ǹ� ���α׷��� ����Ǳ� ������ �� ���� �Ұ�) 
	// final ������ �׻� �ʱⰪ�� �����Ǿ�� ��
	// ��ü�� ������ �� �޸𸮿� �ö�
	
	
	public Test3(){
		System.out.println("������ ... ");
		PI = 3.14;
		System.out.println("��� : PI =" + PI);
	}

	
	public static void main(String[] args) {

			Test3 obj1 = new Test3();
			System.out.println("---------------");
			Test3 obj2 = new Test3();
	}
}
