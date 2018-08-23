package com.day11.calendar;

class SuperClass{
	
	protected int a= 10 , b = 20;
	
	public void write(){
		System.out.println("Superclass write()...");
		System.out.println("a : " + a + " b : " + b);
	}
	
}

class SubClass extends SuperClass{
	
	protected int b = 30, c = 40;
	
	
	@Override
	public void write() {
		System.out.println("Subclass write()...");
		System.out.println("a : " + a + " b : " + b + " c : " + c);
		System.out.println("부모클래스의 b : "+ super.b);
		
	}
	
	public void print1(){
		System.out.println("Subclass print1()...");
		write();
	}
	
	public void print2(){
		System.out.println("Subclass print2()...");
		
	}
	
}

public class Test4 {
	public static void main(String[] args) {
		SubClass subobj = new SubClass();
		
//		subobj.write();
		subobj.print1();
		subobj.print2();
		
		System.out.println("ob.b : " + subobj.b);
		System.out.println("((SuperClass)subobj).b : " + ((SuperClass)subobj).b);
		
		((SuperClass)subobj).write(); // ★★★ 
		
		
	}
	
}
