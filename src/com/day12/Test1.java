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
		
		b = (TestB)a; //부모와 자식관계(상속관계)일때만 UPCAST 또는 DOWNCAST 가능
		a = b;
		
	}

}
