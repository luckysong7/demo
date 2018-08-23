package com.day10;

class A{
	public int x = 10;
	
	public A(){
		
	}
	
	public A(int x){
		this.x = x;
	}
	
	public void print() {
		System.out.println("x : " + x);
		
	}
	
}

class B extends A{
	public int y = 20;
	
	// �ڽ�Ŭ���� ������ �ȿ� �θ�Ŭ���� �⺻������ super()�� �����Ǿ� ����
	
	public B(){
		super();
	}
	
	public B(int x){
		super(x);
	}
	
	
	public void write() {
		System.out.println("y : " + y);
	}
}



public class Test1 {
	public static void main(String[] args) {
		
		B ob = new B();
		
		ob.write();
		ob.print();
		
	}
}
