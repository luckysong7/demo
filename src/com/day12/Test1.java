package com.day12;

class TestA {
	
	public void print() {
		System.out.println("TestA Class ");
	}
	
}

class TestB extends TestA{
	
	public void print() {
		System.out.println("TestB Class ");
	}
}



public class Test1 {

	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b = new TestB();
		
		b = (TestB)a; //�θ�� �ڽİ���(��Ӱ���)�϶��� UPCAST �Ǵ� DOWNCAST ����
		a = b;
		
	}

}
