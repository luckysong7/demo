package com.day19.swing;

// Class Ŭ����
// Ư��Ŭ������ �������̽��� ������ �˻��� �� �ִ� 
// �޼ҵ带 ����

class Test {
	public void write() {

		System.out.println("�׽�Ʈ ..");
	}
	
	
}

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> c = Class.forName("com.day19.swing.Test");
		
		Object ob = c.newInstance(); // ��ü����
		
		Test t = (Test)ob; // DOWNCAST
		
		t.write();
	}
}
