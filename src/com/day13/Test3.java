package com.day13;

//����Ŭ����
//��ø

class Outer2 {
	static int a = 10;
	int b = 20;

	public static class Inner { // static Ŭ������ �� ó�� �޸𸮿� �ö�����

		int c = 30;

		public void write() {
			System.out.println("a : " + a);
			// System.out.println("b : " + b); // static Ŭ�������� �ν��Ͻ� ���� ��� �Ұ�
			System.out.println("c : " + c);

			// ���� �޸𸮿� �ö� �ִ� staticŬ������ �ܺο� �ִ� Ŭ������ �������־�� ��
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
