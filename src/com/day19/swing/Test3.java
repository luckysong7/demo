package com.day19.swing;

// Class 클래스
// 특정클래스나 인터페이스의 정보를 검색할 수 있는 
// 메소드를 제공

class Test {
	public void write() {

		System.out.println("테스트 ..");
	}
	
	
}

public class Test3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> c = Class.forName("com.day19.swing.Test");
		
		Object ob = c.newInstance(); // 객체생성
		
		Test t = (Test)ob; // DOWNCAST
		
		t.write();
	}
}
